package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.materialUiCoreStrings.span
import typings.materialUiCore.tableSortLabelTableSortLabelMod.TableSortLabelTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortLabelMod extends Shortcut {
  
  /**
    * A button based label for placing inside `TableCell` for column sorting.
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableSortLabel API](https://mui.com/api/table-sort-label/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/TableSortLabel", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]] = js.native
  
  type _To = ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `tableSortLabelMod.foo` */
  override def _to: ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]] = default
}
