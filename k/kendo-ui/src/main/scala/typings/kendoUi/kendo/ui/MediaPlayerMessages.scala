package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerMessages extends js.Object {
  var fullscreen: js.UndefOr[String] = js.undefined
  var mute: js.UndefOr[String] = js.undefined
  var pause: js.UndefOr[String] = js.undefined
  var play: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
  var unmute: js.UndefOr[String] = js.undefined
}

object MediaPlayerMessages {
  @scala.inline
  def apply(
    fullscreen: String = null,
    mute: String = null,
    pause: String = null,
    play: String = null,
    quality: String = null,
    unmute: String = null
  ): MediaPlayerMessages = {
    val __obj = js.Dynamic.literal()
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (mute != null) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (unmute != null) __obj.updateDynamic("unmute")(unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerMessages]
  }
}

