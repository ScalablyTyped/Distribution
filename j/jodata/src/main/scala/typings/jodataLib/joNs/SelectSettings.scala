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
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): SelectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultSelect")(DefaultSelect)
    __obj.updateDynamic("Select")(Select)
    __obj.updateDynamic("isSet")(isSet)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[SelectSettings]
  }
}

