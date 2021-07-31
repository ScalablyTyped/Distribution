package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.inputBaseInputBaseMod.InputBaseProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputBaseMod extends Shortcut {
  
  @JSImport("@material-ui/core/InputBase", JSImport.Default)
  @js.native
  val default: ComponentType[InputBaseProps] = js.native
  
  type _To = ComponentType[InputBaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `inputBaseMod.foo` */
  override def _to: ComponentType[InputBaseProps] = default
}
