package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.NC
import typings.johnnyDashFive.johnnyDashFiveStrings.NO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchOption extends js.Object {
  var pin: Double | String
  var `type`: js.UndefOr[NO | NC] = js.undefined
}

object SwitchOption {
  @scala.inline
  def apply(pin: Double | String, `type`: NO | NC = null): SwitchOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOption]
  }
}

