package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.cardCardMod.CardProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod extends Shortcut {
  
  @JSImport("@material-ui/core/Card", JSImport.Default)
  @js.native
  val default: ComponentType[CardProps] = js.native
  
  type _To = ComponentType[CardProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardMod.foo` */
  override def _to: ComponentType[CardProps] = default
}
