package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mdLeaveMod {
  
  @JSImport("@ionic/core/dist/types/components/action-sheet/animations/md.leave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mdLeaveAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("mdLeaveAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
