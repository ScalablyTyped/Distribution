package typings
package inversifyDashExpressDashUtilsLib.dtsResultsInternalServerErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalServerErrorResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
}

object InternalServerErrorResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: () => js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
  ): InternalServerErrorResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[InternalServerErrorResult]
  }
}

