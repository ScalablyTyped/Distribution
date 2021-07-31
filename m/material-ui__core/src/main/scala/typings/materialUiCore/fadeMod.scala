package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.fadeFadeMod.FadeProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeMod extends Shortcut {
  
  @JSImport("@material-ui/core/Fade", JSImport.Default)
  @js.native
  val default: ComponentType[FadeProps] = js.native
  
  type _To = ComponentType[FadeProps]
  
  /* This means you don't have to write `default`, but can instead just say `fadeMod.foo` */
  override def _to: ComponentType[FadeProps] = default
}
