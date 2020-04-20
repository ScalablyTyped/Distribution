package typings.kendoUi.kendo.effects

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fade extends Effect {
  def direction(value: String): Fade
  def endValue(value: Double): Fade
  def startValue(value: Double): Fade
}

object Fade {
  @scala.inline
  def apply(
    add: Effect => Effect,
    direction: String => Fade,
    duration: Double => Effect,
    endValue: Double => Fade,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    startValue: Double => Fade,
    stop: () => Effect
  ): Fade = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Fade]
  }
}

