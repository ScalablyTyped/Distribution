package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.StepperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepperProps extends js.Object {
  var activeStep: js.UndefOr[scala.Double] = js.undefined
  var linear: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.horizontal | materialDashUiLib.materialDashUiLibStrings.vertical
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object StepperProps {
  @scala.inline
  def apply(
    activeStep: scala.Int | scala.Double = null,
    linear: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: materialDashUiLib.materialDashUiLibStrings.horizontal | materialDashUiLib.materialDashUiLibStrings.vertical = null,
    style: reactLib.reactMod.CSSProperties = null
  ): StepperProps = {
    val __obj = js.Dynamic.literal()
    if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepperProps]
  }
}

