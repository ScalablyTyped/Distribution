package typings
package atMaterialDashUiCoreLib.tablesortlabelTableSortLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/TableSortLabel/TableSortLabel.TableSortLabelClassKey, never>) */ trait TableSortLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableSortLabelClassKey] {
  var IconComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.svgiconSvgIconMod.SvgIconProps]
  ] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.asc | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.desc
  ] = js.undefined
  var hideSortIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

