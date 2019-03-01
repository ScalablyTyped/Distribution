package typings
package inversifyDashExpressDashUtilsLib.dtsResultsOkResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OkResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
}

object OkResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ]
  ): OkResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiController")(apiController)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.asInstanceOf[OkResult]
  }
}

