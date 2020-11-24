package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.transitionMod.TransitionOptions
import typings.std.Element
import typings.std.HTMLElement
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/utils/transition/ios.transition", JSImport.Namespace)
@js.native
object iosTransitionMod extends js.Object {
  
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = js.native
  
  def shadow[T /* <: Element */](el: T): ShadowRoot | T = js.native
}
