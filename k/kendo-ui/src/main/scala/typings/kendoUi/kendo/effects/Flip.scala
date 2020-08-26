package typings.kendoUi.kendo.effects

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flip extends Effect {
  def direction(value: String): Flip = js.native
}

object Flip {
  @scala.inline
  def apply(
    add: Effect => Effect,
    direction: String => Flip,
    duration: Double => Effect,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    stop: () => Effect
  ): Flip = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Flip]
  }
  @scala.inline
  implicit class FlipOps[Self <: Flip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: String => Flip): Self = this.set("direction", js.Any.fromFunction1(value))
  }
  
}

