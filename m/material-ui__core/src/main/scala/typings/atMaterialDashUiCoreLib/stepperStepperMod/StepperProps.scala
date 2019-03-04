package typings
package atMaterialDashUiCoreLib.stepperStepperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Paper.PaperProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/Paper.PaperProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Paper.PaperProps, @material-ui/core.@material-ui/core/Stepper/Stepper.StepperClasskey, never>) */ trait StepperProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[StepperClasskey] {
  var activeStep: js.UndefOr[scala.Double] = js.undefined
  var alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var connector: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var nonLinear: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object StepperProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    activeStep: scala.Int | scala.Double = null,
    alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[StepperClasskey]] = null,
    connector: reactLib.reactMod.ReactNs.ReactElement[_] | reactLib.reactMod.ReactNs.ReactNode = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    nonLinear: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: Orientation = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): StepperProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(alternativeLabel)) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(nonLinear)) __obj.updateDynamic("nonLinear")(nonLinear)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepperProps]
  }
}

