package typings
package inversifyDashExpressDashUtilsLib.dtsResultsExceptionResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var error: js.Any
}

object ExceptionResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    error: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ]
  ): ExceptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiController")(apiController)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.asInstanceOf[ExceptionResult]
  }
}

