package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zoom extends Effect {
  def direction(value: java.lang.String): Zoom
  def endValue(value: scala.Double): Zoom
  def startValue(value: scala.Double): Zoom
}

object Zoom {
  @scala.inline
  def apply(
    add: js.Function1[Effect, Zoom],
    direction: js.Function1[java.lang.String, Zoom],
    duration: js.Function1[scala.Double, Zoom],
    endValue: js.Function1[scala.Double, Zoom],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    startValue: js.Function1[scala.Double, Zoom],
    stop: js.Function0[Zoom]
  ): Zoom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("endValue")(endValue)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("reverse")(reverse)
    __obj.updateDynamic("startValue")(startValue)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Zoom]
  }
}

