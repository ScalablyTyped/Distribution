package typings.jodata.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopSettings extends ISettings {
  var DefaultTop: Double
  var Top: Double
}

object TopSettings {
  @scala.inline
  def apply(DefaultTop: Double, Top: Double, isSet: () => Boolean, reset: () => Unit, toString: () => String): TopSettings = {
    val __obj = js.Dynamic.literal(DefaultTop = DefaultTop, Top = Top, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[TopSettings]
  }
}

