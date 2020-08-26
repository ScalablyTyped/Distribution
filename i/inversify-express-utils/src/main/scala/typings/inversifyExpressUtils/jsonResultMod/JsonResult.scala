package typings.inversifyExpressUtils.jsonResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonResult extends IHttpActionResult {
  var apiController: js.Any = js.native
  val json: js.Any = js.native
  val statusCode: Double = js.native
}

object JsonResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: () => js.Promise[HttpResponseMessage],
    json: js.Any,
    statusCode: Double
  ): JsonResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), json = json.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonResult]
  }
  @scala.inline
  implicit class JsonResultOps[Self <: JsonResult] (val x: Self) extends AnyVal {
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
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

