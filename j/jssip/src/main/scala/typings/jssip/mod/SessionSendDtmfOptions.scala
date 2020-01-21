package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionSendDtmfOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var interToneGap: Double
}

object SessionSendDtmfOptions {
  @scala.inline
  def apply(interToneGap: Double, duration: Int | Double = null, extraHeaders: js.Array[String] = null): SessionSendDtmfOptions = {
    val __obj = js.Dynamic.literal(interToneGap = interToneGap.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSendDtmfOptions]
  }
}

