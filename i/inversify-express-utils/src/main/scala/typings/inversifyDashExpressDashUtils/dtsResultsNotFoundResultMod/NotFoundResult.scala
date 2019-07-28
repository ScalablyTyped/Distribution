package typings.inversifyDashExpressDashUtils.dtsResultsNotFoundResultMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFoundResult extends IHttpActionResult {
  var apiController: js.Any
}

object NotFoundResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): NotFoundResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[NotFoundResult]
  }
}

