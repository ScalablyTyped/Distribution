package typings.inversifyDashExpressDashUtils.dtsResultsResponseMessageResultMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMessageResult extends IHttpActionResult {
  var apiController: js.Any
  var message: js.Any
}

object ResponseMessageResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], message: js.Any): ResponseMessageResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = js.Any.fromFunction0(executeAsync), message = message)
  
    __obj.asInstanceOf[ResponseMessageResult]
  }
}

