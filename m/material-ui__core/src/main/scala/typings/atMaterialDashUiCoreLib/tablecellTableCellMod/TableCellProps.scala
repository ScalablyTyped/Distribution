package typings
package atMaterialDashUiCoreLib.tablecellTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TableCell/TableCell.TableCellBaseProps, 'classes' | 'align'> ]: @material-ui/core.@material-ui/core/TableCell/TableCell.TableCellBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/TableCell/TableCell.TableCellBaseProps, @material-ui/core.@material-ui/core/TableCell/TableCell.TableCellClassKey, 'align'>) */ trait TableCellProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableCellClassKey] {
  var align: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.justify
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TableCellBaseProps]] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var sortDirection: js.UndefOr[SortDirection] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.head | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.footer
  ] = js.undefined
}

