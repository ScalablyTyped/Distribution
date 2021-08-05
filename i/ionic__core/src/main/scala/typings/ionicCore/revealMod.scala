package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.menuInterfaceMod.MenuI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revealMod {
  
  @JSImport("@ionic/core/dist/types/utils/menu-controller/animations/reveal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def menuRevealAnimation(menu: MenuI): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("menuRevealAnimation")(menu.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
