package typings
package atMaterialDashUiCoreLib.inputadornmentInputAdornmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/InputAdornment/InputAdornment.InputAdornmentClassKey, never>) */ trait InputAdornmentProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputAdornmentClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[InputAdornmentProps]] = js.undefined
  var disableTypography: js.UndefOr[scala.Boolean] = js.undefined
  var position: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.start | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.end
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

