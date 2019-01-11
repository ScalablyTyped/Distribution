package typings
package atMaterialDashUiCoreLib.appbarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Paper.PaperProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/Paper.PaperProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Paper.PaperProps, @material-ui/core.@material-ui/core/AppBar/AppBar.AppBarClassKey, never>) */ trait AppBarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[AppBarClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color] = js.undefined
  var position: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.absolute | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.sticky | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.relative
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

