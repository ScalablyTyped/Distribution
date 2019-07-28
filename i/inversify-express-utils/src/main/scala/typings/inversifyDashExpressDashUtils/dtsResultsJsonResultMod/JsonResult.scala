package typings.inversifyDashExpressDashUtils.dtsResultsJsonResultMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonResult extends IHttpActionResult {
  var apiController: js.Any
  val json: js.Any
  val statusCode: Double
}

object JsonResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: () => js.Promise[HttpResponseMessage],
    json: js.Any,
    statusCode: Double
  ): JsonResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = js.Any.fromFunction0(executeAsync), json = json, statusCode = statusCode)
  
    __obj.asInstanceOf[JsonResult]
  }
}

