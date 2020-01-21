package typings.keya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValue extends js.Object {
  var key: js.Any
  var value: js.Any
}

object AnonKeyValue {
  @scala.inline
  def apply(key: js.Any, value: js.Any): AnonKeyValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyValue]
  }
}

