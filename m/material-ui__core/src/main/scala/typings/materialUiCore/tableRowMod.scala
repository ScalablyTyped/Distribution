package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.tr
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tableRowTableRowMod.TableRowTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowMod extends Shortcut {
  
  /**
    * Will automatically set dynamic row height
    * based on the material table element parent (head, body, etc).
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableRow API](https://mui.com/api/table-row/)
    */
  @JSImport("@material-ui/core/TableRow", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableRowTypeMap[js.Object, tr]] = js.native
  
  type _To = OverridableComponent[TableRowTypeMap[js.Object, tr]]
  
  /* This means you don't have to write `default`, but can instead just say `tableRowMod.foo` */
  override def _to: OverridableComponent[TableRowTypeMap[js.Object, tr]] = default
}
