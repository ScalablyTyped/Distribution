package typings
package inversifyDashExpressDashUtilsLib.dtsResultsCreatedNegotiatedContentResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedNegotiatedContentResult[T]
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
  var content: js.Any
  var location: js.Any
}

object CreatedNegotiatedContentResult {
  @scala.inline
  def apply[T](
    apiController: js.Any,
    content: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ],
    location: js.Any
  ): CreatedNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiController")(apiController)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[CreatedNegotiatedContentResult[T]]
  }
}

