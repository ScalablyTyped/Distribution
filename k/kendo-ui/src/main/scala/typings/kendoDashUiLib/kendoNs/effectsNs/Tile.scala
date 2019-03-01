package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile extends Effect {
  def direction(value: java.lang.String): Tile
}

object Tile {
  @scala.inline
  def apply(
    add: js.Function1[Effect, Tile],
    direction: js.Function1[java.lang.String, Tile],
    duration: js.Function1[scala.Double, Tile],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[Tile]
  ): Tile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("reverse")(reverse)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Tile]
  }
}

