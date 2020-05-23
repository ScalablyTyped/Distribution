package typings.inversifyExpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var controller: js.Any
  var endpoints: js.Array[Args]
}

object Controller {
  @scala.inline
  def apply(controller: js.Any, endpoints: js.Array[Args]): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
}

