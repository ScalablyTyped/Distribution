package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThermometerOption extends js.Object {
  var controller: js.UndefOr[java.lang.String] = js.undefined
  var freq: js.UndefOr[scala.Double] = js.undefined
  var pin: java.lang.String | scala.Double
  var toCelsius: js.UndefOr[js.Function1[/* val */ scala.Double, scala.Double]] = js.undefined
}

object ThermometerOption {
  @scala.inline
  def apply(
    pin: java.lang.String | scala.Double,
    controller: java.lang.String = null,
    freq: scala.Int | scala.Double = null,
    toCelsius: js.Function1[/* val */ scala.Double, scala.Double] = null
  ): ThermometerOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (toCelsius != null) __obj.updateDynamic("toCelsius")(toCelsius)
    __obj.asInstanceOf[ThermometerOption]
  }
}

