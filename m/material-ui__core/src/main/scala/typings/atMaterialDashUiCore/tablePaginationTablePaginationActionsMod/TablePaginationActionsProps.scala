package typings.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod

import typings.atMaterialDashUiCore.PartialIconButtonProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablePaginationActionsProps extends HTMLAttributes[HTMLDivElement] {
  var backIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
  var count: Double = js.native
  var nextIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
  var page: Double = js.native
  var rowsPerPage: Double = js.native
  def onChangePage(event: Null, page: Double): Unit = js.native
  def onChangePage(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], page: Double): Unit = js.native
}

