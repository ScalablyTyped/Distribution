package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.avatarAvatarMod.AvatarProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod extends Shortcut {
  
  @JSImport("@material-ui/core/Avatar", JSImport.Default)
  @js.native
  val default: ComponentType[AvatarProps] = js.native
  
  type _To = ComponentType[AvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `avatarMod.foo` */
  override def _to: ComponentType[AvatarProps] = default
}
