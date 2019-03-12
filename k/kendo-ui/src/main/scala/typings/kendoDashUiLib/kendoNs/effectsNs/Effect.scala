package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect extends js.Object {
  def add(effect: Effect): Effect
  def duration(value: scala.Double): Effect
  def play(): kendoDashUiLib.JQueryPromise[_]
  def reverse(): kendoDashUiLib.JQueryPromise[_]
  def stop(): Effect
}

object Effect {
  @scala.inline
  def apply(
    add: Effect => Effect,
    duration: scala.Double => Effect,
    play: () => kendoDashUiLib.JQueryPromise[_],
    reverse: () => kendoDashUiLib.JQueryPromise[_],
    stop: () => Effect
  ): Effect = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Effect]
  }
}

