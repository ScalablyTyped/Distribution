package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tableTableMod.TableProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod extends Shortcut {
  
  @JSImport("@material-ui/core/Table", JSImport.Default)
  @js.native
  val default: ComponentType[TableProps] = js.native
  
  type _To = ComponentType[TableProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableMod.foo` */
  override def _to: ComponentType[TableProps] = default
}
