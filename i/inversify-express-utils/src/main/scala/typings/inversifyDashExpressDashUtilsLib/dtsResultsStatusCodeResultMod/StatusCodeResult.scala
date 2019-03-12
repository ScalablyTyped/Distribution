package typings
package inversifyDashExpressDashUtilsLib.dtsResultsStatusCodeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var statusCode: js.Any
}

object StatusCodeResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: () => js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage],
    statusCode: js.Any
  ): StatusCodeResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = js.Any.fromFunction0(executeAsync), statusCode = statusCode)
  
    __obj.asInstanceOf[StatusCodeResult]
  }
}

