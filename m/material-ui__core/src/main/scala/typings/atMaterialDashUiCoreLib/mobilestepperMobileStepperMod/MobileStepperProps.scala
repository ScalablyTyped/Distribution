package typings
package atMaterialDashUiCoreLib.mobilestepperMobileStepperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Paper.PaperProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/Paper.PaperProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Paper.PaperProps, @material-ui/core.@material-ui/core/MobileStepper/MobileStepper.MobileStepperClassKey, never>) */ trait MobileStepperProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MobileStepperClassKey] {
  var LinearProgressProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.linearprogressLinearProgressMod.LinearProgressProps]
  ] = js.undefined
  var activeStep: js.UndefOr[scala.Double] = js.undefined
  var backButton: reactLib.reactMod.ReactNs.ReactElement[_]
  var className: js.UndefOr[java.lang.String] = js.undefined
  var nextButton: reactLib.reactMod.ReactNs.ReactElement[_]
  var position: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static
  ] = js.undefined
  var steps: scala.Double
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dots | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.progress
  ] = js.undefined
}

object MobileStepperProps {
  @scala.inline
  def apply(
    backButton: reactLib.reactMod.ReactNs.ReactElement[_],
    nextButton: reactLib.reactMod.ReactNs.ReactElement[_],
    steps: scala.Double,
    LinearProgressProps: stdLib.Partial[atMaterialDashUiCoreLib.linearprogressLinearProgressMod.LinearProgressProps] = null,
    activeStep: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MobileStepperClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    position: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dots | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.progress = null
  ): MobileStepperProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backButton")(backButton)
    __obj.updateDynamic("nextButton")(nextButton)
    __obj.updateDynamic("steps")(steps)
    if (LinearProgressProps != null) __obj.updateDynamic("LinearProgressProps")(LinearProgressProps)
    if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileStepperProps]
  }
}

