package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingOption extends js.Object {
  var freq: js.UndefOr[scala.Double] = js.undefined
  var pin: scala.Double | java.lang.String
  var pulse: js.UndefOr[scala.Double] = js.undefined
}

object PingOption {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    freq: scala.Int | scala.Double = null,
    pulse: scala.Int | scala.Double = null
  ): PingOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (pulse != null) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingOption]
  }
}

