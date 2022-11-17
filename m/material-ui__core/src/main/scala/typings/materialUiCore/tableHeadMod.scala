package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.tableHeadTableHeadMod.TableHeadTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableHead API](https://mui.com/api/table-head/)
    */
  @JSImport("@material-ui/core/TableHead", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableHeadTypeMap[js.Object, "thead"]] = js.native
  
  type _To = OverridableComponent[TableHeadTypeMap[js.Object, "thead"]]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadMod.foo` */
  override def _to: OverridableComponent[TableHeadTypeMap[js.Object, "thead"]] = default
}
