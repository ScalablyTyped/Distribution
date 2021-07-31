package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.menuInterfaceMod.MenuI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushMod {
  
  @JSImport("@ionic/core/dist/types/utils/menu-controller/animations/push", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def menuPushAnimation(menu: MenuI): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("menuPushAnimation")(menu.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
