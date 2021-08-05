package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverAnimationsMdEnterMod {
  
  @JSImport("@ionic/core/dist/types/components/popover/animations/md.enter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdEnterAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("mdEnterAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
  inline def mdEnterAnimation(baseEl: HTMLElement, ev: Event): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdEnterAnimation")(baseEl.asInstanceOf[js.Any], ev.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
