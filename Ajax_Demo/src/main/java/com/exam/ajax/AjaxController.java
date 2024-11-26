package com.exam.ajax;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping(
			value="/jsonReq", 
			method=RequestMethod.GET,
			produces="application/json;charset=utf8"
			)
	public @ResponseBody String mtdAjaxSend(Model model) {
		
		JSONObject jsonObject = new JSONObject();

		try {
			jsonObject.put("name", "John");
			jsonObject.put("age", 30);
		} catch (JSONException e) {
			System.out.println("JsonEx : " + e.getMessage());
		}
		
		return jsonObject.toString();
	}
	
	
	@RequestMapping("/ajaxPrn")
	public String mtdAjaxPrn() {
		return "ajaxPrn";
	}
	
	
}
