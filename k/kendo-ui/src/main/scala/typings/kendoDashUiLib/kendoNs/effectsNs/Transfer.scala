package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transfer extends Effect

object Transfer {
  @scala.inline
  def apply(
    add: js.Function1[Effect, Transfer],
    duration: js.Function1[scala.Double, Transfer],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[Transfer]
  ): Transfer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("reverse")(reverse)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Transfer]
  }
}

