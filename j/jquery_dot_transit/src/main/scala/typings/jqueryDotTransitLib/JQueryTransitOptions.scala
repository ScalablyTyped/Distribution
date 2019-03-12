package typings
package jqueryDotTransitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transit //////////////////////////////////////////////////
trait JQueryTransitOptions extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[js.Any] = js.undefined
}

object JQueryTransitOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    scale: js.Any = null
  ): JQueryTransitOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[JQueryTransitOptions]
  }
}

