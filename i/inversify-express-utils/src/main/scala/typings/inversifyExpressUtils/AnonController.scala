package typings.inversifyExpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonController extends js.Object {
  var controller: js.Any
  var endpoints: js.Array[AnonArgs]
}

object AnonController {
  @scala.inline
  def apply(controller: js.Any, endpoints: js.Array[AnonArgs]): AnonController = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonController]
  }
}

