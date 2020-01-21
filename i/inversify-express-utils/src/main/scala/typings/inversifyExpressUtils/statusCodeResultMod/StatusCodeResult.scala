package typings.inversifyExpressUtils.statusCodeResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeResult extends IHttpActionResult {
  var apiController: js.Any
  var statusCode: js.Any
}

object StatusCodeResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], statusCode: js.Any): StatusCodeResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatusCodeResult]
  }
}

