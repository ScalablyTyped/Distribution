package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.tableHeadTableHeadMod.TableHeadProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadMod extends Shortcut {
  
  @JSImport("@material-ui/core/TableHead", JSImport.Default)
  @js.native
  val default: ComponentType[TableHeadProps] = js.native
  
  type _To = ComponentType[TableHeadProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadMod.foo` */
  override def _to: ComponentType[TableHeadProps] = default
}
