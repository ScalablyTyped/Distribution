package typings.inversifyExpressUtils.statusCodeResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodeResult extends IHttpActionResult {
  
  var apiController: js.Any = js.native
  
  var statusCode: js.Any = js.native
}
object StatusCodeResult {
  
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], statusCode: js.Any): StatusCodeResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCodeResult]
  }
  
  @scala.inline
  implicit class StatusCodeResultOps[Self <: StatusCodeResult] (val x: Self) extends AnyVal {
    
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
    def setApiController(value: js.Any): Self = this.set("apiController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: js.Any): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
