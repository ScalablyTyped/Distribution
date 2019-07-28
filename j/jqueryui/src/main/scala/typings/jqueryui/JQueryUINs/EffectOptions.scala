package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Effects //////////////////////////////////////////////////
trait EffectOptions extends js.Object {
  var complete: js.Function
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var effect: String
}

object EffectOptions {
  @scala.inline
  def apply(complete: js.Function, effect: String, duration: Int | Double = null, easing: String = null): EffectOptions = {
    val __obj = js.Dynamic.literal(complete = complete, effect = effect)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[EffectOptions]
  }
}

