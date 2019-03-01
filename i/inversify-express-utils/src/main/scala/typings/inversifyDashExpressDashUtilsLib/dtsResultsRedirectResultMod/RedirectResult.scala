package typings
package inversifyDashExpressDashUtilsLib.dtsResultsRedirectResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var location: js.Any
}

object RedirectResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ],
    location: js.Any
  ): RedirectResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiController")(apiController)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[RedirectResult]
  }
}

