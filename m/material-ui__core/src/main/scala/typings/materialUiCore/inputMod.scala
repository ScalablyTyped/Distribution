package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.inputInputMod.InputProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("@material-ui/core/Input", JSImport.Default)
  @js.native
  val default: ComponentType[InputProps] = js.native
  
  type _To = ComponentType[InputProps]
  
  /* This means you don't have to write `default`, but can instead just say `inputMod.foo` */
  override def _to: ComponentType[InputProps] = default
}
