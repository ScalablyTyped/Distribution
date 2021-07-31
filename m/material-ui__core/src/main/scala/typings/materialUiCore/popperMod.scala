package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.popperPopperMod.PopperProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Popper", JSImport.Default)
  @js.native
  val default: ComponentType[PopperProps] = js.native
  
  type _To = ComponentType[PopperProps]
  
  /* This means you don't have to write `default`, but can instead just say `popperMod.foo` */
  override def _to: ComponentType[PopperProps] = default
}
