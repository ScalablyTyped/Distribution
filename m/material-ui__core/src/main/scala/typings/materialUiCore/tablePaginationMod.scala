package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tablePaginationTablePaginationMod.TablePaginationBaseProps
import typings.materialUiCore.tablePaginationTablePaginationMod.TablePaginationTypeMap
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationMod extends Shortcut {
  
  /**
    * A `TableCell` based component for placing inside `TableFooter` for pagination.
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TablePagination API](https://mui.com/api/table-pagination/)
    * - inherits [TableCell API](https://mui.com/api/table-cell/)
    */
  @JSImport("@material-ui/core/TablePagination", JSImport.Default)
  @js.native
  val default: OverridableComponent[TablePaginationTypeMap[js.Object, ComponentType[TablePaginationBaseProps]]] = js.native
  
  type _To = OverridableComponent[TablePaginationTypeMap[js.Object, ComponentType[TablePaginationBaseProps]]]
  
  /* This means you don't have to write `default`, but can instead just say `tablePaginationMod.foo` */
  override def _to: OverridableComponent[TablePaginationTypeMap[js.Object, ComponentType[TablePaginationBaseProps]]] = default
}
