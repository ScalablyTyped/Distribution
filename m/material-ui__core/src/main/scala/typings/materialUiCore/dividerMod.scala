package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.dividerDividerMod.DividerProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod extends Shortcut {
  
  @JSImport("@material-ui/core/Divider", JSImport.Default)
  @js.native
  val default: ComponentType[DividerProps] = js.native
  
  type _To = ComponentType[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerMod.foo` */
  override def _to: ComponentType[DividerProps] = default
}
