package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPlayerOptions extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autoRepeat: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  var forwardSeek: js.UndefOr[Boolean] = js.native
  var fullScreen: js.UndefOr[Boolean] = js.native
  var media: js.UndefOr[MediaPlayerMedia] = js.native
  var messages: js.UndefOr[MediaPlayerMessages] = js.native
  var mute: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var navigatable: js.UndefOr[Boolean] = js.native
  var pause: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  var play: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  var ready: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  var timeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  var volume: js.UndefOr[Double] = js.native
  var volumeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
}

object MediaPlayerOptions {
  @scala.inline
  def apply(): MediaPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerOptions]
  }
  @scala.inline
  implicit class MediaPlayerOptionsOps[Self <: MediaPlayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setAutoRepeat(value: Boolean): Self = this.set("autoRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRepeat: Self = this.set("autoRepeat", js.undefined)
    @scala.inline
    def setEnd(value: /* e */ MediaPlayerEvent => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setForwardSeek(value: Boolean): Self = this.set("forwardSeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardSeek: Self = this.set("forwardSeek", js.undefined)
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setMedia(value: MediaPlayerMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMessages(value: MediaPlayerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    @scala.inline
    def setPause(value: /* e */ MediaPlayerEvent => Unit): Self = this.set("pause", js.Any.fromFunction1(value))
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: /* e */ MediaPlayerEvent => Unit): Self = this.set("play", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setReady(value: /* e */ MediaPlayerEvent => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setTimeChange(value: /* e */ MediaPlayerEvent => Unit): Self = this.set("timeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTimeChange: Self = this.set("timeChange", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setVolumeChange(value: /* e */ MediaPlayerEvent => Unit): Self = this.set("volumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVolumeChange: Self = this.set("volumeChange", js.undefined)
  }
  
}

