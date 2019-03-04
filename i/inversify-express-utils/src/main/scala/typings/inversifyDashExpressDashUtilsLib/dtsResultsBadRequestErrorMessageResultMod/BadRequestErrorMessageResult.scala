package typings
package inversifyDashExpressDashUtilsLib.dtsResultsBadRequestErrorMessageResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadRequestErrorMessageResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var message: js.Any
}

object BadRequestErrorMessageResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ],
    message: js.Any
  ): BadRequestErrorMessageResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = executeAsync, message = message)
  
    __obj.asInstanceOf[BadRequestErrorMessageResult]
  }
}

