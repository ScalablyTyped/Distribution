package typings
package atMaterialDashUiCoreLib.tablepaginationTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps, 'classes' | 'component'> ]: @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps, @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationClassKey, 'component'>) */ @js.native
trait TablePaginationProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TablePaginationClassKey] {
  var ActionsComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactType[
      atMaterialDashUiCoreLib.tablepaginationTablePaginationActionsMod.TablePaginationActionsProps
    ]
  ] = js.native
  var SelectProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.selectSelectMod.SelectProps]] = js.native
  var backIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconbuttonIconButtonMod.IconButtonProps]] = js.native
  var className: js.UndefOr[java.lang.String] = js.native
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[TablePaginationBaseProps]] = js.native
  var count: scala.Double = js.native
  var labelDisplayedRows: js.UndefOr[
    js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.native
  var labelRowsPerPage: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  var nextIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconbuttonIconButtonMod.IconButtonProps]] = js.native
  var onChangeRowsPerPage: js.UndefOr[
    reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLTextAreaElement | reactLib.HTMLInputElement]
  ] = js.native
  var page: scala.Double = js.native
  var rowsPerPage: scala.Double = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[scala.Double]] = js.native
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  def onChangePage(
    event: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent],
    page: scala.Double
  ): scala.Unit = js.native
  def onChangePage(event: scala.Null, page: scala.Double): scala.Unit = js.native
}

