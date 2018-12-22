package typings
package atMaterialDashUiCoreLib.tablepaginationTablePaginationActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablePaginationActionsProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var backIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconbuttonIconButtonMod.IconButtonProps]] = js.native
  var count: scala.Double = js.native
  var nextIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconbuttonIconButtonMod.IconButtonProps]] = js.native
  var page: scala.Double = js.native
  var rowsPerPage: scala.Double = js.native
  def onChangePage(
    event: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent],
    page: scala.Double
  ): scala.Unit = js.native
  def onChangePage(event: scala.Null, page: scala.Double): scala.Unit = js.native
}

