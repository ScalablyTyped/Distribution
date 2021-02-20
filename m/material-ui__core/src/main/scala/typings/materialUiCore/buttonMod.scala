package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonButtonMod.ButtonProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  @JSImport("@material-ui/core/Button", JSImport.Default)
  @js.native
  val default: ComponentType[ButtonProps] = js.native
  
  type _To = ComponentType[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: ComponentType[ButtonProps] = default
}
