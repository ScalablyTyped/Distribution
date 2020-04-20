package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashComponentInstance extends js.Object {
  var parameters: js.Array[_]
}

object FlashComponentInstance {
  @scala.inline
  def apply(parameters: js.Array[_]): FlashComponentInstance = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashComponentInstance]
  }
}

