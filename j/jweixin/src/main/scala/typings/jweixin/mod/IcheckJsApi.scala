package typings.jweixin.mod

import typings.jweixin.anon.CheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IcheckJsApi extends BaseParams {
  
  var jsApiList: typings.jweixin.mod.jsApiList = js.native
  
   // 需要检测的JS接口列表，所有JS接口列表见附录2,
  // 以键值对的形式返回，可用的api值true，不可用为false
  // 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
  @JSName("success")
  def success_MIcheckJsApi(res: CheckResult): Unit = js.native
}
object IcheckJsApi {
  
  @scala.inline
  def apply(jsApiList: jsApiList, success: CheckResult => Unit): IcheckJsApi = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IcheckJsApi]
  }
  
  @scala.inline
  implicit class IcheckJsApiOps[Self <: IcheckJsApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJsApiListVarargs(value: ApiMethod*): Self = this.set("jsApiList", js.Array(value :_*))
    
    @scala.inline
    def setJsApiList(value: jsApiList): Self = this.set("jsApiList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: CheckResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
