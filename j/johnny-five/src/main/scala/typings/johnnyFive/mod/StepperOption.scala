package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperOption extends js.Object {
  var direction: js.UndefOr[Double] = js.undefined
  var pins: js.Any
  var rpm: js.UndefOr[Double] = js.undefined
  var stepsPerRev: Double
  var `type`: Double
}

object StepperOption {
  @scala.inline
  def apply(
    pins: js.Any,
    stepsPerRev: Double,
    `type`: Double,
    direction: js.UndefOr[Double] = js.undefined,
    rpm: js.UndefOr[Double] = js.undefined
  ): StepperOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], stepsPerRev = stepsPerRev.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rpm)) __obj.updateDynamic("rpm")(rpm.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOption]
  }
}

