package typings.atMaterialDashUiCore

import org.scalablytyped.runtime.TopLevel
import typings.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Namespace)
@js.native
object tablePaginationTablePaginationActionsMod extends js.Object {
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
  
  @js.native
  class default protected ()
    extends Component[TablePaginationActionsProps, ComponentState, js.Any] {
    def this(props: TablePaginationActionsProps) = this()
    def this(props: TablePaginationActionsProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[TablePaginationActionsProps]]
  
}

