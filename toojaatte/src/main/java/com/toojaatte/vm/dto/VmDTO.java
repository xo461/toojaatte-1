// SQL Developer 와 맞춰준다. 
package com.toojaatte.vm.dto;

import java.util.Date;

import lombok.Data;

@Data
// @Data 어노테이션으로 getter, setter, 생성자, toString() 자동생성 이 된다
// 자바에서는 위에 모든것을 직접 만들어야 한다. 
public class VmDTO {
	
	private int no;
	private String cName; 
	private Date updateDate;
	private double opening_p, closing_p;
	private Date cTime;

	}
	

