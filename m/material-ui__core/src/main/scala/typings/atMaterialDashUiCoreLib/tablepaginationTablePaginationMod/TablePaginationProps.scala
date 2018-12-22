package typings
package atMaterialDashUiCoreLib.tablepaginationTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ @js.native
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

