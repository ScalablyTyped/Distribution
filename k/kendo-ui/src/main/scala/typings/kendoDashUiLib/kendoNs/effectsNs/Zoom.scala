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
    add: Effect => Zoom,
    direction: java.lang.String => Zoom,
    duration: scala.Double => Zoom,
    endValue: scala.Double => Zoom,
    play: () => kendoDashUiLib.JQueryPromise[_],
    reverse: () => kendoDashUiLib.JQueryPromise[_],
    startValue: scala.Double => Zoom,
    stop: () => Zoom
  ): Zoom = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Zoom]
  }
}

