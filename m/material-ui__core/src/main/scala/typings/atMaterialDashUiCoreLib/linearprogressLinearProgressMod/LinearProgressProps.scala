package typings
package atMaterialDashUiCoreLib.linearprogressLinearProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/LinearProgress/LinearProgress.LinearProgressClassKey, never>) */ trait LinearProgressProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[LinearProgressClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var valueBuffer: js.UndefOr[scala.Double] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.determinate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.indeterminate | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.buffer | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.query
  ] = js.undefined
}

