package typings.inversifyExpressUtils.createdNegotiatedContentResultMod

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedNegotiatedContentResult[T] extends IHttpActionResult {
  var apiController: js.Any
  var content: js.Any
  var location: js.Any
}

object CreatedNegotiatedContentResult {
  @scala.inline
  def apply[T](
    apiController: js.Any,
    content: js.Any,
    executeAsync: () => js.Promise[HttpResponseMessage],
    location: js.Any
  ): CreatedNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatedNegotiatedContentResult[T]]
  }
}

