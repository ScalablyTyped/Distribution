package typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs

import typings.materialDashUi.materialDashUiStrings.horizontal
import typings.materialDashUi.materialDashUiStrings.vertical
import typings.react.reactMod.CSSProperties
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
    activeStep: Int | Double = null,
    linear: js.UndefOr[Boolean] = js.undefined,
    orientation: horizontal | vertical = null,
    style: CSSProperties = null
  ): StepperProps = {
    val __obj = js.Dynamic.literal()
    if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepperProps]
  }
}

