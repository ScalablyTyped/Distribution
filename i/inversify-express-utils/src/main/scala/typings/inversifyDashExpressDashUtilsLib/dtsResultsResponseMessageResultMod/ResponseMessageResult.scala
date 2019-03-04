package typings
package inversifyDashExpressDashUtilsLib.dtsResultsResponseMessageResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMessageResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var message: js.Any
}

object ResponseMessageResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ],
    message: js.Any
  ): ResponseMessageResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = executeAsync, message = message)
  
    __obj.asInstanceOf[ResponseMessageResult]
  }
}

