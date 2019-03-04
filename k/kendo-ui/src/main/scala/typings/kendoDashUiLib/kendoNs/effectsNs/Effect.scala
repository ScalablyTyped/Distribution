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
    add: js.Function1[Effect, Effect],
    duration: js.Function1[scala.Double, Effect],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[Effect]
  ): Effect = {
    val __obj = js.Dynamic.literal(add = add, duration = duration, play = play, reverse = reverse, stop = stop)
  
    __obj.asInstanceOf[Effect]
  }
}

