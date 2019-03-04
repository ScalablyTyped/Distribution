package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideIn extends Effect {
  def direction(value: java.lang.String): SlideIn
}

object SlideIn {
  @scala.inline
  def apply(
    add: js.Function1[Effect, SlideIn],
    direction: js.Function1[java.lang.String, SlideIn],
    duration: js.Function1[scala.Double, SlideIn],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[SlideIn]
  ): SlideIn = {
    val __obj = js.Dynamic.literal(add = add, direction = direction, duration = duration, play = play, reverse = reverse, stop = stop)
  
    __obj.asInstanceOf[SlideIn]
  }
}

