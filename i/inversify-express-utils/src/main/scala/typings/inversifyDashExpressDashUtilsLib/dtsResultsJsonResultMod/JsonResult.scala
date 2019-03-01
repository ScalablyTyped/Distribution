package typings
package inversifyDashExpressDashUtilsLib.dtsResultsJsonResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  val json: js.Any
  val statusCode: scala.Double
}

object JsonResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ],
    json: js.Any,
    statusCode: scala.Double
  ): JsonResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiController")(apiController)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[JsonResult]
  }
}

