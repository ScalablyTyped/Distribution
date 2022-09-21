package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.table
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tableTableMod.TableTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [Table API](https://mui.com/api/table/)
    */
  @JSImport("@material-ui/core/Table", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableTypeMap[js.Object, table]] = js.native
  
  type _To = OverridableComponent[TableTypeMap[js.Object, table]]
  
  /* This means you don't have to write `default`, but can instead just say `tableMod.foo` */
  override def _to: OverridableComponent[TableTypeMap[js.Object, table]] = default
}
