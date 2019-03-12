package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSettings extends ISettings {
  var DefaultSelect: js.Array[java.lang.String]
  var Select: js.Array[java.lang.String]
}

object SelectSettings {
  @scala.inline
  def apply(
    DefaultSelect: js.Array[java.lang.String],
    Select: js.Array[java.lang.String],
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): SelectSettings = {
    val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect, Select = Select, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[SelectSettings]
  }
}

