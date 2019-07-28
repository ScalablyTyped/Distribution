package typings.johnnyDashFive.johnnyDashFiveMod

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
    direction: Int | Double = null,
    rpm: Int | Double = null
  ): StepperOption = {
    val __obj = js.Dynamic.literal(pins = pins, stepsPerRev = stepsPerRev)
    __obj.updateDynamic("type")(`type`)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (rpm != null) __obj.updateDynamic("rpm")(rpm.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOption]
  }
}

