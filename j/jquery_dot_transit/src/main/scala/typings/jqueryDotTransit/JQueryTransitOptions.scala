package typings.jqueryDotTransit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transit //////////////////////////////////////////////////
trait JQueryTransitOptions extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[js.Any] = js.undefined
}

object JQueryTransitOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: String = null,
    opacity: Int | Double = null,
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

