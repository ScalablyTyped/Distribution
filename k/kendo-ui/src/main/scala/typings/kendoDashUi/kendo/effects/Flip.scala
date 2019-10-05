package typings.kendoDashUi.kendo.effects

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flip extends Effect {
  def direction(value: String): Flip
}

object Flip {
  @scala.inline
  def apply(
    add: Effect => Flip,
    direction: String => Flip,
    duration: Double => Flip,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    stop: () => Flip
  ): Flip = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Flip]
  }
}

