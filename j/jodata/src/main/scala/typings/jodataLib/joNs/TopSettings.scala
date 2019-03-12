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
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): TopSettings = {
    val __obj = js.Dynamic.literal(DefaultTop = DefaultTop, Top = Top, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[TopSettings]
  }
}

