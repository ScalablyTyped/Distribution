package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.avatarAvatarMod.AvatarTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    *
    * API:
    *
    * - [Avatar API](https://mui.com/api/avatar/)
    */
  @JSImport("@material-ui/core/Avatar", JSImport.Default)
  @js.native
  val default: OverridableComponent[AvatarTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[AvatarTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `avatarMod.foo` */
  override def _to: OverridableComponent[AvatarTypeMap[js.Object, "div"]] = default
}
