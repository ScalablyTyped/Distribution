package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.PartialIconButtonProps
import typings.react.mod.ComponentType
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationActionsMod extends Shortcut {
  
  @JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Default)
  @js.native
  val default: ComponentType[TablePaginationActionsProps] = js.native
  
  @js.native
  trait TablePaginationActionsProps extends HTMLAttributes[HTMLDivElement] {
    
    var backIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
    
    var count: Double = js.native
    
    var nextIconButtonProps: js.UndefOr[PartialIconButtonProps] = js.native
    
    def onChangePage(event: Null, page: Double): Unit = js.native
    def onChangePage(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], page: Double): Unit = js.native
    
    var page: Double = js.native
    
    var rowsPerPage: Double = js.native
  }
  
  type _To = ComponentType[TablePaginationActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `tablePaginationActionsMod.foo` */
  override def _to: ComponentType[TablePaginationActionsProps] = default
}
