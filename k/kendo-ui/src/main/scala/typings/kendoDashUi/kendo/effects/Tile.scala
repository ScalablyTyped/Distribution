package typings.kendoDashUi.kendo.effects

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile extends Effect {
  def direction(value: String): Tile
}

object Tile {
  @scala.inline
  def apply(
    add: Effect => Tile,
    direction: String => Tile,
    duration: Double => Tile,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    stop: () => Tile
  ): Tile = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Tile]
  }
}

