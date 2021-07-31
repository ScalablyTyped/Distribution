package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.transitionMod.TransitionOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mdTransitionMod {
  
  @JSImport("@ionic/core/dist/types/utils/transition/md.transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdTransitionAnimation")(_underscore.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
}
