package typings.ionicCore

import typings.std.HTMLElement
import typings.std.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/animation/old-animation/transition-end", JSImport.Namespace)
@js.native
object transitionEndMod extends js.Object {
  def transitionEnd(el: Null, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  def transitionEnd(el: HTMLElement, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
}

