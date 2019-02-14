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
  var backButton: reactLib.reactMod.ReactNs.ReactElement
  var className: js.UndefOr[java.lang.String] = js.undefined
  var nextButton: reactLib.reactMod.ReactNs.ReactElement
  var position: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static
  ] = js.undefined
  var steps: scala.Double
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.text | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dots | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.progress
  ] = js.undefined
}

