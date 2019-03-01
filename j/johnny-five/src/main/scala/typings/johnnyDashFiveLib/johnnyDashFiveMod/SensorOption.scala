package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorOption extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var freq: js.UndefOr[scala.Boolean] = js.undefined
  var pin: scala.Double | java.lang.String
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object SensorOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    freq: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): SensorOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOption]
  }
}

