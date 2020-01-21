package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var stick: js.UndefOr[String] = js.undefined
  var unstick: js.UndefOr[String] = js.undefined
}

object AnonClose {
  @scala.inline
  def apply(close: String = null, stick: String = null, unstick: String = null): AnonClose = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (stick != null) __obj.updateDynamic("stick")(stick.asInstanceOf[js.Any])
    if (unstick != null) __obj.updateDynamic("unstick")(unstick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

