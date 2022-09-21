package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tableContainerTableContainerMod.TableContainerTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableContainer API](https://mui.com/api/table-container/)
    */
  @JSImport("@material-ui/core/TableContainer", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableContainerTypeMap[js.Object, div]] = js.native
  
  type _To = OverridableComponent[TableContainerTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `tableContainerMod.foo` */
  override def _to: OverridableComponent[TableContainerTypeMap[js.Object, div]] = default
}
