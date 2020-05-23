package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var id: String
  var value: Object
}

object Value {
  @scala.inline
  def apply(id: String, value: Object): Value = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

