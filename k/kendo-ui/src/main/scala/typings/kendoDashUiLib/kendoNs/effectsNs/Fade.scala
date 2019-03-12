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
    add: Effect => Fade,
    direction: java.lang.String => Fade,
    duration: scala.Double => Fade,
    endValue: scala.Double => Fade,
    play: () => kendoDashUiLib.JQueryPromise[_],
    reverse: () => kendoDashUiLib.JQueryPromise[_],
    startValue: scala.Double => Fade,
    stop: () => Fade
  ): Fade = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Fade]
  }
}

