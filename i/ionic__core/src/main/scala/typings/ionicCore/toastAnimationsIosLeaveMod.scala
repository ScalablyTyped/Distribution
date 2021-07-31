package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastAnimationsIosLeaveMod {
  
  @JSImport("@ionic/core/dist/types/components/toast/animations/ios.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def iosLeaveAnimation(baseEl: ShadowRoot, position: String): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
