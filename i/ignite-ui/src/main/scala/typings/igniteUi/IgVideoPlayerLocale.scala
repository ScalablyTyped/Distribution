package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayerLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets ad message text.
    *
    */
  var adMessage: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets long ad message text.
    *
    */
  var adMessageLong: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets ad message text when no duration is specified.
    *
    */
  var adMessageNoDuration: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets new ad window title.
    *
    */
  var adNewWindowTip: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets buffering label text.
    *
    */
  var buffering: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets enter fullscreen button title.
    *
    */
  var enterFullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets exit fullscreen button title.
    *
    */
  var exitFullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets live video title.
    *
    */
  var live: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets live stream video title.
    *
    */
  var liveStream: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets paused button title.
    *
    */
  var paused: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets play button title.
    *
    */
  var play: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets playing button title.
    *
    */
  var playing: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets progress label long format.
    *
    */
  var progressLabelLongFormat: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets progress label short format.
    *
    */
  var progressLabelShortFormat: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets related videos text.
    *
    */
  var relatedVideos: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets replay button text.
    *
    */
  var replayButton: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets replay button tooltip.
    *
    */
  var replayTooltip: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets skip to button title.
    *
    */
  var skipTo: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets volume button title.
    *
    */
  var volume: js.UndefOr[Boolean] = js.native
}

object IgVideoPlayerLocale {
  @scala.inline
  def apply(): IgVideoPlayerLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerLocale]
  }
  @scala.inline
  implicit class IgVideoPlayerLocaleOps[Self <: IgVideoPlayerLocale] (val x: Self) extends AnyVal {
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
    def setAdMessage(value: Boolean): Self = this.set("adMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdMessage: Self = this.set("adMessage", js.undefined)
    @scala.inline
    def setAdMessageLong(value: Boolean): Self = this.set("adMessageLong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdMessageLong: Self = this.set("adMessageLong", js.undefined)
    @scala.inline
    def setAdMessageNoDuration(value: Boolean): Self = this.set("adMessageNoDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdMessageNoDuration: Self = this.set("adMessageNoDuration", js.undefined)
    @scala.inline
    def setAdNewWindowTip(value: Boolean): Self = this.set("adNewWindowTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdNewWindowTip: Self = this.set("adNewWindowTip", js.undefined)
    @scala.inline
    def setBuffering(value: Boolean): Self = this.set("buffering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffering: Self = this.set("buffering", js.undefined)
    @scala.inline
    def setEnterFullscreen(value: Boolean): Self = this.set("enterFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterFullscreen: Self = this.set("enterFullscreen", js.undefined)
    @scala.inline
    def setExitFullscreen(value: Boolean): Self = this.set("exitFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitFullscreen: Self = this.set("exitFullscreen", js.undefined)
    @scala.inline
    def setLive(value: Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    @scala.inline
    def setLiveStream(value: Boolean): Self = this.set("liveStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveStream: Self = this.set("liveStream", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setPlay(value: Boolean): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setPlaying(value: Boolean): Self = this.set("playing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    @scala.inline
    def setProgressLabelLongFormat(value: Boolean): Self = this.set("progressLabelLongFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressLabelLongFormat: Self = this.set("progressLabelLongFormat", js.undefined)
    @scala.inline
    def setProgressLabelShortFormat(value: Boolean): Self = this.set("progressLabelShortFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressLabelShortFormat: Self = this.set("progressLabelShortFormat", js.undefined)
    @scala.inline
    def setRelatedVideos(value: Boolean): Self = this.set("relatedVideos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedVideos: Self = this.set("relatedVideos", js.undefined)
    @scala.inline
    def setReplayButton(value: Boolean): Self = this.set("replayButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplayButton: Self = this.set("replayButton", js.undefined)
    @scala.inline
    def setReplayTooltip(value: Boolean): Self = this.set("replayTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplayTooltip: Self = this.set("replayTooltip", js.undefined)
    @scala.inline
    def setSkipTo(value: Boolean): Self = this.set("skipTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipTo: Self = this.set("skipTo", js.undefined)
    @scala.inline
    def setVolume(value: Boolean): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

