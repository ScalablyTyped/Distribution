package typings.jqueryui.JQueryUI

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
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectOptions]
  }
}

