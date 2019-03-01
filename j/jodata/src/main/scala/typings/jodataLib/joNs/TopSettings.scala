package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopSettings extends ISettings {
  var DefaultTop: scala.Double
  var Top: scala.Double
}

object TopSettings {
  @scala.inline
  def apply(
    DefaultTop: scala.Double,
    Top: scala.Double,
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): TopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultTop")(DefaultTop)
    __obj.updateDynamic("Top")(Top)
    __obj.updateDynamic("isSet")(isSet)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[TopSettings]
  }
}

