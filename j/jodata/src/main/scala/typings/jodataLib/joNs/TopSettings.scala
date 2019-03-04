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
    val __obj = js.Dynamic.literal(DefaultTop = DefaultTop, Top = Top, isSet = isSet, reset = reset, toString = toString)
  
    __obj.asInstanceOf[TopSettings]
  }
}

