package typings.jssip.jssipMod

import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCAnswerOptions
import typings.std.RTCConfiguration
import typings.std.RTCOfferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionAnswerOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var mediaConstraints: js.UndefOr[MediaStreamConstraints] = js.undefined
  var mediaStream: js.UndefOr[MediaStream] = js.undefined
  var pcConfig: js.UndefOr[RTCConfiguration] = js.undefined
  var rtcAnswerConstraints: js.UndefOr[RTCAnswerOptions] = js.undefined
  var rtcConstraints: js.UndefOr[js.Any] = js.undefined
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.undefined
  var sessionTimersExpires: js.UndefOr[Double] = js.undefined
}

object SessionAnswerOptions {
  @scala.inline
  def apply(
    extraHeaders: js.Array[String] = null,
    mediaConstraints: MediaStreamConstraints = null,
    mediaStream: MediaStream = null,
    pcConfig: RTCConfiguration = null,
    rtcAnswerConstraints: RTCAnswerOptions = null,
    rtcConstraints: js.Any = null,
    rtcOfferConstraints: RTCOfferOptions = null,
    sessionTimersExpires: Int | Double = null
  ): SessionAnswerOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (mediaConstraints != null) __obj.updateDynamic("mediaConstraints")(mediaConstraints.asInstanceOf[js.Any])
    if (mediaStream != null) __obj.updateDynamic("mediaStream")(mediaStream.asInstanceOf[js.Any])
    if (pcConfig != null) __obj.updateDynamic("pcConfig")(pcConfig.asInstanceOf[js.Any])
    if (rtcAnswerConstraints != null) __obj.updateDynamic("rtcAnswerConstraints")(rtcAnswerConstraints.asInstanceOf[js.Any])
    if (rtcConstraints != null) __obj.updateDynamic("rtcConstraints")(rtcConstraints.asInstanceOf[js.Any])
    if (rtcOfferConstraints != null) __obj.updateDynamic("rtcOfferConstraints")(rtcOfferConstraints.asInstanceOf[js.Any])
    if (sessionTimersExpires != null) __obj.updateDynamic("sessionTimersExpires")(sessionTimersExpires.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAnswerOptions]
  }
}

