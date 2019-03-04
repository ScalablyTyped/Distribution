package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTurn extends Effect {
  def direction(value: java.lang.String): PageTurn
}

object PageTurn {
  @scala.inline
  def apply(
    add: js.Function1[Effect, PageTurn],
    direction: js.Function1[java.lang.String, PageTurn],
    duration: js.Function1[scala.Double, PageTurn],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[PageTurn]
  ): PageTurn = {
    val __obj = js.Dynamic.literal(add = add, direction = direction, duration = duration, play = play, reverse = reverse, stop = stop)
  
    __obj.asInstanceOf[PageTurn]
  }
}

