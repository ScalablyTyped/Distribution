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
  def apply(
    DefaultSelect: js.Array[String],
    Select: js.Array[String],
    isSet: () => Boolean,
    reset: () => Unit,
    toString: () => String
  ): SelectSettings = {
    val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect, Select = Select, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[SelectSettings]
  }
}

