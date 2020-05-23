package typings.johnnyFive.mod

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
  def apply(
    pin: Double | String,
    freq: js.UndefOr[Double] = js.undefined,
    pulse: js.UndefOr[Double] = js.undefined
  ): PingOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingOption]
  }
}

