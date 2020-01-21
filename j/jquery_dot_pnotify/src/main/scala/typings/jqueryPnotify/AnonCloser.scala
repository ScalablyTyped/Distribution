package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloser extends js.Object {
  var closer: js.UndefOr[String] = js.undefined
  var pin_down: js.UndefOr[String] = js.undefined
  var pin_up: js.UndefOr[String] = js.undefined
}

object AnonCloser {
  @scala.inline
  def apply(closer: String = null, pin_down: String = null, pin_up: String = null): AnonCloser = {
    val __obj = js.Dynamic.literal()
    if (closer != null) __obj.updateDynamic("closer")(closer.asInstanceOf[js.Any])
    if (pin_down != null) __obj.updateDynamic("pin_down")(pin_down.asInstanceOf[js.Any])
    if (pin_up != null) __obj.updateDynamic("pin_up")(pin_up.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloser]
  }
}

