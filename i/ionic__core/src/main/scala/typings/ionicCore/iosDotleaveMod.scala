package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosDotleaveMod {
  
  @JSImport("@ionic/core/dist/types/components/alert/animations/ios.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iosLeaveAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
