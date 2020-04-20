package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopSettings extends ISettings {
  var DefaultTop: Double
  var Top: Double
}

object TopSettings {
  @scala.inline
  def apply(DefaultTop: Double, Top: Double, isSet: () => Boolean, reset: () => Unit): TopSettings = {
    val __obj = js.Dynamic.literal(DefaultTop = DefaultTop.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[TopSettings]
  }
}

