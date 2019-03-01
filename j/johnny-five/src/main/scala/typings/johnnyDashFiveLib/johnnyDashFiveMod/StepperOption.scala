package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperOption extends js.Object {
  var direction: js.UndefOr[scala.Double] = js.undefined
  var pins: js.Any
  var rpm: js.UndefOr[scala.Double] = js.undefined
  var stepsPerRev: scala.Double
  var `type`: scala.Double
}

object StepperOption {
  @scala.inline
  def apply(
    pins: js.Any,
    stepsPerRev: scala.Double,
    `type`: scala.Double,
    direction: scala.Int | scala.Double = null,
    rpm: scala.Int | scala.Double = null
  ): StepperOption = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("pins")(pins)
    __obj.updateDynamic("stepsPerRev")(stepsPerRev)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (rpm != null) __obj.updateDynamic("rpm")(rpm.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOption]
  }
}

