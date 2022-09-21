package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.tbody
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tableBodyTableBodyMod.TableBodyTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableBody API](https://mui.com/api/table-body/)
    */
  @JSImport("@material-ui/core/TableBody", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableBodyTypeMap[js.Object, tbody]] = js.native
  
  type _To = OverridableComponent[TableBodyTypeMap[js.Object, tbody]]
  
  /* This means you don't have to write `default`, but can instead just say `tableBodyMod.foo` */
  override def _to: OverridableComponent[TableBodyTypeMap[js.Object, tbody]] = default
}
