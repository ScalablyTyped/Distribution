package typings
package inversifyDashExpressDashUtilsLib.dtsResultsBadRequestResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadRequestResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
}

object BadRequestResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ]
  ): BadRequestResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = executeAsync)
  
    __obj.asInstanceOf[BadRequestResult]
  }
}

