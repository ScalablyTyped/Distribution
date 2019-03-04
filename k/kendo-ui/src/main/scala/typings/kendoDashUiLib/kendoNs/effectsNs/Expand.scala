package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends Effect {
  def direction(value: java.lang.String): Expand
}

object Expand {
  @scala.inline
  def apply(
    add: js.Function1[Effect, Expand],
    direction: js.Function1[java.lang.String, Expand],
    duration: js.Function1[scala.Double, Expand],
    play: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    reverse: js.Function0[kendoDashUiLib.JQueryPromise[_]],
    stop: js.Function0[Expand]
  ): Expand = {
    val __obj = js.Dynamic.literal(add = add, direction = direction, duration = duration, play = play, reverse = reverse, stop = stop)
  
    __obj.asInstanceOf[Expand]
  }
}

