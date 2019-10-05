package typings.inversifyDashExpressDashUtils.dtsResultsConflictResultMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictResult extends IHttpActionResult {
  var apiController: js.Any
}

object ConflictResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ConflictResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[ConflictResult]
  }
}

