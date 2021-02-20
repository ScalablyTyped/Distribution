package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tableCellTableCellMod.TableCellProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod extends Shortcut {
  
  @JSImport("@material-ui/core/TableCell", JSImport.Default)
  @js.native
  val default: ComponentType[TableCellProps] = js.native
  
  type _To = ComponentType[TableCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableCellMod.foo` */
  override def _to: ComponentType[TableCellProps] = default
}
