package typings
package atMaterialDashUiCoreLib.toolbarToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Toolbar/Toolbar.ToolbarClassKey, never>) */ trait ToolbarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ToolbarClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableGutters: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.regular | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense
  ] = js.undefined
}

