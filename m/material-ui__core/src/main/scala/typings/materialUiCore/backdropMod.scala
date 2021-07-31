package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.backdropBackdropMod.BackdropProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropMod extends Shortcut {
  
  @JSImport("@material-ui/core/Backdrop", JSImport.Default)
  @js.native
  val default: ComponentType[BackdropProps] = js.native
  
  type _To = ComponentType[BackdropProps]
  
  /* This means you don't have to write `default`, but can instead just say `backdropMod.foo` */
  override def _to: ComponentType[BackdropProps] = default
}
