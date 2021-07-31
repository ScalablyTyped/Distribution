package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsIosEnterMod {
  
  @JSImport("@ionic/core/dist/types/components/loading/animations/ios.enter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def iosEnterAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("iosEnterAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
