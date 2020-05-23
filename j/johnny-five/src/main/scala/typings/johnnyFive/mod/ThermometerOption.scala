package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThermometerOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var freq: js.UndefOr[Double] = js.undefined
  var pin: String | Double
  var toCelsius: js.UndefOr[js.Function1[/* val */ Double, Double]] = js.undefined
}

object ThermometerOption {
  @scala.inline
  def apply(
    pin: String | Double,
    controller: String = null,
    freq: js.UndefOr[Double] = js.undefined,
    toCelsius: /* val */ Double => Double = null
  ): ThermometerOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    if (toCelsius != null) __obj.updateDynamic("toCelsius")(js.Any.fromFunction1(toCelsius))
    __obj.asInstanceOf[ThermometerOption]
  }
}

