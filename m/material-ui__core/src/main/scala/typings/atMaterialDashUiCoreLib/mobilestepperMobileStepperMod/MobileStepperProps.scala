package typings
package atMaterialDashUiCoreLib.mobilestepperMobileStepperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait MobileStepperProps
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

