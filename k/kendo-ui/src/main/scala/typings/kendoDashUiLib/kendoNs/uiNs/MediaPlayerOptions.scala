package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerOptions extends js.Object {
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var autoRepeat: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, scala.Unit]] = js.undefined
  var forwardSeek: js.UndefOr[scala.Boolean] = js.undefined
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var media: js.UndefOr[MediaPlayerMedia] = js.undefined
  var messages: js.UndefOr[MediaPlayerMessages] = js.undefined
  var mute: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var pause: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, scala.Unit]] = js.undefined
  var play: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, scala.Unit]] = js.undefined
  var ready: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, scala.Unit]] = js.undefined
  var timeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, scala.Unit]] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
  var volumeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, scala.Unit]] = js.undefined
}

object MediaPlayerOptions {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    autoRepeat: js.UndefOr[scala.Boolean] = js.undefined,
    end: js.Function1[/* e */ MediaPlayerEvent, scala.Unit] = null,
    forwardSeek: js.UndefOr[scala.Boolean] = js.undefined,
    fullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    media: MediaPlayerMedia = null,
    messages: MediaPlayerMessages = null,
    mute: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    pause: js.Function1[/* e */ MediaPlayerEvent, scala.Unit] = null,
    play: js.Function1[/* e */ MediaPlayerEvent, scala.Unit] = null,
    ready: js.Function1[/* e */ MediaPlayerEvent, scala.Unit] = null,
    timeChange: js.Function1[/* e */ MediaPlayerEvent, scala.Unit] = null,
    volume: scala.Int | scala.Double = null,
    volumeChange: js.Function1[/* e */ MediaPlayerEvent, scala.Unit] = null
  ): MediaPlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (!js.isUndefined(autoRepeat)) __obj.updateDynamic("autoRepeat")(autoRepeat)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(forwardSeek)) __obj.updateDynamic("forwardSeek")(forwardSeek)
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    if (media != null) __obj.updateDynamic("media")(media)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (play != null) __obj.updateDynamic("play")(play)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (timeChange != null) __obj.updateDynamic("timeChange")(timeChange)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (volumeChange != null) __obj.updateDynamic("volumeChange")(volumeChange)
    __obj.asInstanceOf[MediaPlayerOptions]
  }
}

