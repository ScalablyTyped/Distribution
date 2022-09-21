package typings.layuiSrc.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date
  extends StObject
     with /* index */ StringDictionary[(js.Tuple2[js.RegExp, String]) | (js.Function1[/* arg */ Any, Any])] {
  
  /**
    * 日期验证 date[0]是正则,date[1]是验证失败的提示（"日期格式不正确"）
    */
  var date: js.Tuple2[js.RegExp, String]
  
  /**
    * 邮箱验证 email[0]是正则,email[1]是验证失败的提示（"邮箱格式不正确"）
    */
  var email: js.Tuple2[js.RegExp, String]
  
  /**
    * 身份证号验证 identity[0]是正则,identity[1]是验证失败的提示（ 请输入正确的身份证号"）
    */
  var identity: js.Tuple2[js.RegExp, String]
  
  /**
    * 验证数字，如果参数不是数字则返回"只能填写数字"，是数字则无返回值  <br/>&nbsp;
    *   bug：当0,"0"会提示不是数字
    * @param [arg] 参数 比如 1,"1",-1
    */
  def number(arg: Any): String | Null
  
  /**
    * 手机号验证 phone[0]是正则,phone[1]是验证失败的提示（"请输入正确的手机号"）
    */
  var phone: js.Tuple2[js.RegExp, String]
  
  /**
    * 空值验证 required[0]是正则,required[1]是为空的提示（"必填项不能为空"）
    */
  var required: js.Tuple2[js.RegExp, String]
  
  /**
    * url验证 url[0]是正则,url[1]是验证失败的提示（"链接格式不正确"）
    */
  var url: js.Tuple2[js.RegExp, String]
}
object Date {
  
  inline def apply(
    date: js.Tuple2[js.RegExp, String],
    email: js.Tuple2[js.RegExp, String],
    identity: js.Tuple2[js.RegExp, String],
    number: Any => String | Null,
    phone: js.Tuple2[js.RegExp, String],
    required: js.Tuple2[js.RegExp, String],
    url: js.Tuple2[js.RegExp, String]
  ): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], number = js.Any.fromFunction1(number), phone = phone.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: js.Tuple2[js.RegExp, String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: js.Tuple2[js.RegExp, String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: js.Tuple2[js.RegExp, String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Any => String | Null): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
    
    inline def setPhone(value: js.Tuple2[js.RegExp, String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: js.Tuple2[js.RegExp, String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: js.Tuple2[js.RegExp, String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
