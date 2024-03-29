package typings.jweixin.mod

import typings.jweixin.anon.CheckResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IcheckJsApi
  extends StObject
     with BaseParams {
  
  var jsApiList: typings.jweixin.mod.jsApiList
  
  // 需要检测的JS接口列表，所有JS接口列表见附录2,
  // 以键值对的形式返回，可用的api值true，不可用为false
  // 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
  @JSName("success")
  def success_MIcheckJsApi(res: CheckResult): Unit
}
object IcheckJsApi {
  
  inline def apply(jsApiList: jsApiList, success: CheckResult => Unit): IcheckJsApi = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IcheckJsApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IcheckJsApi] (val x: Self) extends AnyVal {
    
    inline def setJsApiList(value: jsApiList): Self = StObject.set(x, "jsApiList", value.asInstanceOf[js.Any])
    
    inline def setJsApiListVarargs(value: ApiMethod*): Self = StObject.set(x, "jsApiList", js.Array(value*))
    
    inline def setSuccess(value: CheckResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
