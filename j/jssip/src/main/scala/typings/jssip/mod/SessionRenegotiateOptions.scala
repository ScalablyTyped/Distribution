package typings.jssip.mod

import typings.std.RTCOfferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionRenegotiateOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  var useUpdate: js.UndefOr[Boolean] = js.undefined
}

object SessionRenegotiateOptions {
  @scala.inline
  def apply(
    extraHeaders: js.Array[String] = null,
    rtcOfferConstraints: RTCOfferOptions = null,
    useUpdate: js.UndefOr[Boolean] = js.undefined
  ): SessionRenegotiateOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (rtcOfferConstraints != null) __obj.updateDynamic("rtcOfferConstraints")(rtcOfferConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(useUpdate)) __obj.updateDynamic("useUpdate")(useUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionRenegotiateOptions]
  }
}

