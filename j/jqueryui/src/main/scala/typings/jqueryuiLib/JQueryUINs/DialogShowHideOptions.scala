package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogShowHideOptions extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var effect: java.lang.String
}

object DialogShowHideOptions {
  @scala.inline
  def apply(
    effect: java.lang.String,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null
  ): DialogShowHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("effect")(effect)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[DialogShowHideOptions]
  }
}

