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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("reverse")(reverse)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[PageTurn]
  }
}

