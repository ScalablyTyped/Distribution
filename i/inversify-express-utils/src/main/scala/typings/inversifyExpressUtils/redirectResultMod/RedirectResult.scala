package typings.inversifyExpressUtils.redirectResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectResult extends IHttpActionResult {
  var apiController: js.Any
  var location: js.Any
}

object RedirectResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], location: js.Any): RedirectResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectResult]
  }
}

