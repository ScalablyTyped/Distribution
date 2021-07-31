package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.menuInterfaceMod.MenuI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("@ionic/core/dist/types/utils/menu-controller/animations/overlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def menuOverlayAnimation(menu: MenuI): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("menuOverlayAnimation")(menu.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
