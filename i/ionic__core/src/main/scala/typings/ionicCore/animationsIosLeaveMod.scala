package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsIosLeaveMod {
  
  @JSImport("@ionic/core/dist/types/components/loading/animations/ios.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def iosLeaveAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
