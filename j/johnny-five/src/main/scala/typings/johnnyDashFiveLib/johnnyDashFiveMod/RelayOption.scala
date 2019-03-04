package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayOption extends js.Object {
  var pin: scala.Double | java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RelayOption {
  @scala.inline
  def apply(pin: scala.Double | java.lang.String, `type`: java.lang.String = null): RelayOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RelayOption]
  }
}

