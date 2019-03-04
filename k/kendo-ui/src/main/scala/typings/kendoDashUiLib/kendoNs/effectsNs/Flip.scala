package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flip extends Effect {
  def direction(value: java.lang.String): Flip
}

object Flip {
  @scala.inline
  def apply(
    add: js.Function1[Effect, Flip],
    direction: js.Function1[java.lang.String, Flip],
    duration: js.Function1[scala.Double, Flip],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[Flip]
  ): Flip = {
    val __obj = js.Dynamic.literal(add = add, direction = direction, duration = duration, play = play, reverse = reverse, stop = stop)
  
    __obj.asInstanceOf[Flip]
  }
}

