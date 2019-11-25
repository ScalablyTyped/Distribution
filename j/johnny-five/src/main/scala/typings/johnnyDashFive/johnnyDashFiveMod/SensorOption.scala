package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorOption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var freq: js.UndefOr[Boolean] = js.undefined
  var pin: Double | String
  var threshold: js.UndefOr[Double] = js.undefined
}

object SensorOption {
  @scala.inline
  def apply(
    pin: Double | String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    freq: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null
  ): SensorOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOption]
  }
}

