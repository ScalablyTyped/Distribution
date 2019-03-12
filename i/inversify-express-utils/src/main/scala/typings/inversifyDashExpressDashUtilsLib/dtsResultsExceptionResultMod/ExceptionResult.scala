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
    executeAsync: () => js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
  ): ExceptionResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, error = error, executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[ExceptionResult]
  }
}

