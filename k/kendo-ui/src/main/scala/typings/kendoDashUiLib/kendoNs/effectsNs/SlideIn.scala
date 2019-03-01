package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideIn extends Effect {
  def direction(value: java.lang.String): SlideIn
}

object SlideIn {
  @scala.inline
  def apply(
    add: js.Function1[Effect, SlideIn],
    direction: js.Function1[java.lang.String, SlideIn],
    duration: js.Function1[scala.Double, SlideIn],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[SlideIn]
  ): SlideIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("reverse")(reverse)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[SlideIn]
  }
}

