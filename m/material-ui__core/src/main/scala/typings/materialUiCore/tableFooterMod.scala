package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.tfoot
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tableFooterTableFooterMod.TableFooterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableFooter API](https://mui.com/api/table-footer/)
    */
  @JSImport("@material-ui/core/TableFooter", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableFooterTypeMap[js.Object, tfoot]] = js.native
  
  type _To = OverridableComponent[TableFooterTypeMap[js.Object, tfoot]]
  
  /* This means you don't have to write `default`, but can instead just say `tableFooterMod.foo` */
  override def _to: OverridableComponent[TableFooterTypeMap[js.Object, tfoot]] = default
}
