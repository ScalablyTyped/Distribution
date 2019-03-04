package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchOption extends js.Object {
  var pin: scala.Double | java.lang.String
  var `type`: js.UndefOr[
    johnnyDashFiveLib.johnnyDashFiveLibStrings.NO | johnnyDashFiveLib.johnnyDashFiveLibStrings.NC
  ] = js.undefined
}

object SwitchOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    `type`: johnnyDashFiveLib.johnnyDashFiveLibStrings.NO | johnnyDashFiveLib.johnnyDashFiveLibStrings.NC = null
  ): SwitchOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOption]
  }
}

