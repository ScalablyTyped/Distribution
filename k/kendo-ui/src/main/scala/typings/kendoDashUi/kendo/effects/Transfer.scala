package typings.kendoDashUi.kendo.effects

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transfer extends Effect

object Transfer {
  @scala.inline
  def apply(
    add: Effect => Transfer,
    duration: Double => Transfer,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    stop: () => Transfer
  ): Transfer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Transfer]
  }
}

