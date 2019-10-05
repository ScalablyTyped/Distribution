package typings.gtagDotJs.Gtag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlParams extends js.Object {
  var event_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var event_timeout: js.UndefOr[Double] = js.undefined
  var groups: js.UndefOr[String | js.Array[String]] = js.undefined
  var send_to: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ControlParams {
  @scala.inline
  def apply(
    event_callback: () => Unit = null,
    event_timeout: Int | Double = null,
    groups: String | js.Array[String] = null,
    send_to: String | js.Array[String] = null
  ): ControlParams = {
    val __obj = js.Dynamic.literal()
    if (event_callback != null) __obj.updateDynamic("event_callback")(js.Any.fromFunction0(event_callback))
    if (event_timeout != null) __obj.updateDynamic("event_timeout")(event_timeout.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (send_to != null) __obj.updateDynamic("send_to")(send_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlParams]
  }
}

