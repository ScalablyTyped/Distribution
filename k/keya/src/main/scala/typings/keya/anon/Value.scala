package typings.keya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var key: js.Any
  var value: js.Any
}

object Value {
  @scala.inline
  def apply(key: js.Any, value: js.Any): Value = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

