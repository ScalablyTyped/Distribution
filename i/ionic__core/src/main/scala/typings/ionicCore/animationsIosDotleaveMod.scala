package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsIosDotleaveMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/animations/ios.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iosLeaveAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
  inline def iosLeaveAnimation(baseEl: HTMLElement, presentingEl: Unit, duration: Double): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any], presentingEl.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Animation]
  inline def iosLeaveAnimation(baseEl: HTMLElement, presentingEl: HTMLElement): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any], presentingEl.asInstanceOf[js.Any])).asInstanceOf[Animation]
  inline def iosLeaveAnimation(baseEl: HTMLElement, presentingEl: HTMLElement, duration: Double): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosLeaveAnimation")(baseEl.asInstanceOf[js.Any], presentingEl.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
