package typings.keya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var key: js.Any
  var value: js.Any
}

object AnonValue {
  @scala.inline
  def apply(key: js.Any, value: js.Any): AnonValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

