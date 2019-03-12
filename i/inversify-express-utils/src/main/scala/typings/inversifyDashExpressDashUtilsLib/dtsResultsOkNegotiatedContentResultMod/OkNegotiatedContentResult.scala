package typings
package inversifyDashExpressDashUtilsLib.dtsResultsOkNegotiatedContentResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OkNegotiatedContentResult[T]
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var content: js.Any
}

object OkNegotiatedContentResult {
  @scala.inline
  def apply[T](
    apiController: js.Any,
    content: js.Any,
    executeAsync: () => js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
  ): OkNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal(apiController = apiController, content = content, executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[OkNegotiatedContentResult[T]]
  }
}

