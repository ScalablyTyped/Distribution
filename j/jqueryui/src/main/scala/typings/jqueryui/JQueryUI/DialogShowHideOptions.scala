package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogShowHideOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var effect: String
}

object DialogShowHideOptions {
  @scala.inline
  def apply(effect: String, delay: Int | Double = null, duration: Int | Double = null, easing: String = null): DialogShowHideOptions = {
    val __obj = js.Dynamic.literal(effect = effect)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[DialogShowHideOptions]
  }
}

