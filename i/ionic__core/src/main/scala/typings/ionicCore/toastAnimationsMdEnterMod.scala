package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastAnimationsMdEnterMod {
  
  @JSImport("@ionic/core/dist/types/components/toast/animations/md.enter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mdEnterAnimation(baseEl: ShadowRoot, position: String): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdEnterAnimation")(baseEl.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
