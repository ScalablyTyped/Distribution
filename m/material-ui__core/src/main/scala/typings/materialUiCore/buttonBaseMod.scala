package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseMod extends Shortcut {
  
  @JSImport("@material-ui/core/ButtonBase", JSImport.Default)
  @js.native
  val default: ComponentType[ButtonBaseProps] = js.native
  
  type _To = ComponentType[ButtonBaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonBaseMod.foo` */
  override def _to: ComponentType[ButtonBaseProps] = default
}
