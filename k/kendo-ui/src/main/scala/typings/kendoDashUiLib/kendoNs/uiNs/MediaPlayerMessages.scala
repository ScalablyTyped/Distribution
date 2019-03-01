package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerMessages extends js.Object {
  var fullscreen: js.UndefOr[java.lang.String] = js.undefined
  var mute: js.UndefOr[java.lang.String] = js.undefined
  var pause: js.UndefOr[java.lang.String] = js.undefined
  var play: js.UndefOr[java.lang.String] = js.undefined
  var quality: js.UndefOr[java.lang.String] = js.undefined
  var unmute: js.UndefOr[java.lang.String] = js.undefined
}

object MediaPlayerMessages {
  @scala.inline
  def apply(
    fullscreen: java.lang.String = null,
    mute: java.lang.String = null,
    pause: java.lang.String = null,
    play: java.lang.String = null,
    quality: java.lang.String = null,
    unmute: java.lang.String = null
  ): MediaPlayerMessages = {
    val __obj = js.Dynamic.literal()
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen)
    if (mute != null) __obj.updateDynamic("mute")(mute)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (play != null) __obj.updateDynamic("play")(play)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (unmute != null) __obj.updateDynamic("unmute")(unmute)
    __obj.asInstanceOf[MediaPlayerMessages]
  }
}

