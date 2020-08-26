package typings.inversifyExpressUtils.exceptionResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionResult extends IHttpActionResult {
  var apiController: js.Any = js.native
  var error: js.Any = js.native
}

object ExceptionResult {
  @scala.inline
  def apply(apiController: js.Any, error: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ExceptionResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
    __obj.asInstanceOf[ExceptionResult]
  }
  @scala.inline
  implicit class ExceptionResultOps[Self <: ExceptionResult] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

