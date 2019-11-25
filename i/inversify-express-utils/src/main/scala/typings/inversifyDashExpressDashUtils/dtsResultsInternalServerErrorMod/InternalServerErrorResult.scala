package typings.inversifyDashExpressDashUtils.dtsResultsInternalServerErrorMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalServerErrorResult extends IHttpActionResult {
  var apiController: js.Any
}

object InternalServerErrorResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): InternalServerErrorResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[InternalServerErrorResult]
  }
}

