package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinOption extends js.Object {
  var id: js.UndefOr[Double | String] = js.undefined
  var pin: Double | String
  var `type`: js.UndefOr[String] = js.undefined
}

object PinOption {
  @scala.inline
  def apply(pin: Double | String, id: Double | String = null, `type`: String = null): PinOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinOption]
  }
}

