package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fade extends Effect {
  def direction(value: java.lang.String): Fade
  def endValue(value: scala.Double): Fade
  def startValue(value: scala.Double): Fade
}

object Fade {
  @scala.inline
  def apply(
    add: js.Function1[Effect, Fade],
    direction: js.Function1[java.lang.String, Fade],
    duration: js.Function1[scala.Double, Fade],
    endValue: js.Function1[scala.Double, Fade],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    startValue: js.Function1[scala.Double, Fade],
    stop: js.Function0[Fade]
  ): Fade = {
    val __obj = js.Dynamic.literal(add = add, direction = direction, duration = duration, endValue = endValue, play = play, reverse = reverse, startValue = startValue, stop = stop)
  
    __obj.asInstanceOf[Fade]
  }
}

