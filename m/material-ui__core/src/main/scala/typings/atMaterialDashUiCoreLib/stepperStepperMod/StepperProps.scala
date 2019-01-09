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

