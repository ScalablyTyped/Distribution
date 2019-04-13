package typings
package atMaterialDashUiCoreLib.tablePaginationTablePaginationActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablePaginationActionsProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var backIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconButtonIconButtonMod.IconButtonProps]] = js.native
  var count: scala.Double = js.native
  var nextIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconButtonIconButtonMod.IconButtonProps]] = js.native
  var page: scala.Double = js.native
  var rowsPerPage: scala.Double = js.native
  def onChangePage(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent],
    page: scala.Double
  ): scala.Unit = js.native
  def onChangePage(event: scala.Null, page: scala.Double): scala.Unit = js.native
}

