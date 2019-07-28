package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingOption extends js.Object {
  var freq: js.UndefOr[Double] = js.undefined
  var pin: Double | String
  var pulse: js.UndefOr[Double] = js.undefined
}

object PingOption {
  @scala.inline
  def apply(pin: Double | String, freq: Int | Double = null, pulse: Int | Double = null): PingOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (pulse != null) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingOption]
  }
}

