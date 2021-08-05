package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mdDotleaveMod {
  
  @JSImport("@ionic/core/dist/types/components/alert/animations/md.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdLeaveAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("mdLeaveAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
