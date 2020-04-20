package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSettings extends ISettings {
  var DefaultSelect: js.Array[String]
  var Select: js.Array[String]
}

object SelectSettings {
  @scala.inline
  def apply(DefaultSelect: js.Array[String], Select: js.Array[String], isSet: () => Boolean, reset: () => Unit): SelectSettings = {
    val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[SelectSettings]
  }
}

