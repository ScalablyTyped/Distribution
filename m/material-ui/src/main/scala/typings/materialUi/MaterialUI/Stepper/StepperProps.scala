package typings.materialUi.MaterialUI.Stepper

import typings.materialUi.materialUiStrings.horizontal
import typings.materialUi.materialUiStrings.vertical
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperProps extends js.Object {
  var activeStep: js.UndefOr[Double] = js.undefined
  var linear: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StepperProps {
  @scala.inline
  def apply(
    activeStep: js.UndefOr[Double] = js.undefined,
    linear: js.UndefOr[Boolean] = js.undefined,
    orientation: horizontal | vertical = null,
    style: CSSProperties = null
  ): StepperProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeStep)) __obj.updateDynamic("activeStep")(activeStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperProps]
  }
}

