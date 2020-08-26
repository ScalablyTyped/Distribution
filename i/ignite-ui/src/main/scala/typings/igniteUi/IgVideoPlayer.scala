package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayer
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets whether player controls will auto hide when video is not hovered. This is applicable only when Infragistics playback controls are used.
    *
    */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the video should start playing immediately after the control is loaded.
    *
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * Occurs when the banner is clicked.
    *
    * Function takes arguments evt and ui.
    */
  var bannerClick: js.UndefOr[BannerClickEvent] = js.native
  /**
    * Occurs when the banner is hidden.
    *
    * Function takes arguments evt and ui.
    */
  var bannerHidden: js.UndefOr[BannerHiddenEvent] = js.native
  /**
    * Defines the name of the player banner visible event. Fired when the banner has been displayed.
    *
    * Function takes arguments evt and ui.
    */
  var bannerVisible: js.UndefOr[BannerVisibleEvent] = js.native
  /**
    * Gets/Sets an array of banner objects that will show the banners when the video clip is played.
    *
    */
  var banners: js.UndefOr[js.Array[IgVideoPlayerBanner]] = js.native
  /**
    * Occurs when a bookmark is clicked.
    *
    * Function takes arguments evt and ui.
    */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.native
  /**
    * Occurs when a bookmark is hit.
    *
    * Function takes arguments evt and ui.
    */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.native
  /**
    * Gets/Sets an array of bookmarks that will be displayed in the video player control.
    *
    */
  var bookmarks: js.UndefOr[js.Array[IgVideoPlayerBookmark]] = js.native
  /**
    * Gets/Sets whether if you want to use the built in browser controls. By default player uses Infragistics playback controls. Note that you may have different look and feel across different browsers if you use the built in browser controls. When this option is set to true, no [commercials](ui.igvideoplayer#options:commercials) will be displayed as they are not supported.
    *
    */
  var browserControls: js.UndefOr[Boolean] = js.native
  /**
    * Occurs when browser does not support HTML 5 video.
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
    * Occurs when a chunk of data is buffered.
    *
    * Function takes arguments evt and ui.
    */
  var buffering: js.UndefOr[BufferingEvent] = js.native
  /**
    * Gets/Sets the center big button hide delay.
    *
    */
  var centerButtonHideDelay: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets an array of commercials objects that will be displayed when the video is playing. Note that [broswerControls](ui.igvideoplayer#options:browserControls) doesn't support commercials.
    *
    */
  var commercials: js.UndefOr[IgVideoPlayerCommercials] = js.native
  /**
    * Occurs when the video has ended.
    *
    * Function takes arguments evt and ui.
    */
  var ended: js.UndefOr[EndedEvent] = js.native
  /**
    * Occurs when igVideoPlayer enters full screen mode.
    *
    * Function takes arguments evt and ui.
    */
  var enterFullScreen: js.UndefOr[EnterFullScreenEvent] = js.native
  /**
    * Occurs when igVideoPlayer exits full screen mode.
    *
    * Function takes arguments evt and ui.
    */
  var exitFullScreen: js.UndefOr[ExitFullScreenEvent] = js.native
  /**
    * Gets/Sets whether the video player to be in full screen or not. This is not a pure full screen, because browsers do not allow that. It just sets 100% width and height to the control.
    *
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the height of the control. By default null will stretch the control to fit data, if no other heights are defined.
    *
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgVideoPlayerLocale] = js.native
  /**
    * Gets/Sets whether the video to start again after it has ended.
    *
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the video volume is muted.
    *
    */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * Occurs when the video is paused.
    *
    * Function takes arguments evt and ui.
    */
  var paused: js.UndefOr[PausedEvent] = js.native
  /**
    * Occurs when video gets playing.
    *
    * Function takes arguments evt and ui.
    */
  var playing: js.UndefOr[PlayingEvent] = js.native
  /**
    * Gets/Sets a URL to an image to show, when no video data is available.
    *
    */
  var posterUrl: js.UndefOr[String] = js.native
  /**
    * Gets/Sets whether to preload load initial data for duration of video. If true it may start buffering the video, but this highly depends on the specific browser implementation.
    *
    */
  var preload: js.UndefOr[Boolean] = js.native
  /**
    * Occurs when the video has advanced the playback position.
    *
    * Function takes arguments evt and ui.
    */
  var progress: js.UndefOr[ProgressEvent] = js.native
  /**
    * Gets/Sets the format of the video progress label. You should use ${currentTime} to represent current playback position and ${duration} to represent video duration.
    *
    */
  var progressLabelFormat: js.UndefOr[String] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Occurs when a related video is clicked.
    *
    * Function takes arguments evt and ui.
    */
  var relatedVideoClick: js.UndefOr[RelatedVideoClickEvent] = js.native
  /**
    * Gets/Sets an array of related videos that will be displayed when video playback has ended.
    *
    */
  var relatedVideos: js.UndefOr[js.Array[IgVideoPlayerRelatedVideo]] = js.native
  /**
    * Gets/Sets whether the control seek tool tip will be shown when hovering the video progress bar.
    *
    */
  var showSeekTime: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets a list of video sources to choose from. Best coded/format is automatically detected by the control. Supported types are depending on the browser and could be one of the following mov, mp4, webm, ogg.
    *
    */
  var sources: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets/Sets video title.
    *
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the video volume. It can be between 0.0 and 1.0.
    *
    */
  var volume: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets volume slider auto hide delay. This is applicable only when Infragistics playback controls are used.
    *
    */
  var volumeAutohideDelay: js.UndefOr[Double] = js.native
  /**
    * Occurs when igVideoPlayer is waiting for data from the server.
    *
    * Function takes arguments evt and ui.
    */
  var waiting: js.UndefOr[WaitingEvent] = js.native
  /**
    * Gets/Sets the width of the control. By default null will stretch the control to fit data, if no other widths are defined.
    *
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgVideoPlayer {
  @scala.inline
  def apply(): IgVideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayer]
  }
  @scala.inline
  implicit class IgVideoPlayerOps[Self <: IgVideoPlayer] (val x: Self) extends AnyVal {
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
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBannerClick(value: (/* event */ Event, /* ui */ BannerClickEventUIParam) => Unit): Self = this.set("bannerClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBannerClick: Self = this.set("bannerClick", js.undefined)
    @scala.inline
    def setBannerHidden(value: (/* event */ Event, /* ui */ BannerHiddenEventUIParam) => Unit): Self = this.set("bannerHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBannerHidden: Self = this.set("bannerHidden", js.undefined)
    @scala.inline
    def setBannerVisible(value: (/* event */ Event, /* ui */ BannerVisibleEventUIParam) => Unit): Self = this.set("bannerVisible", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBannerVisible: Self = this.set("bannerVisible", js.undefined)
    @scala.inline
    def setBannersVarargs(value: IgVideoPlayerBanner*): Self = this.set("banners", js.Array(value :_*))
    @scala.inline
    def setBanners(value: js.Array[IgVideoPlayerBanner]): Self = this.set("banners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanners: Self = this.set("banners", js.undefined)
    @scala.inline
    def setBookmarkClick(value: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit): Self = this.set("bookmarkClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBookmarkClick: Self = this.set("bookmarkClick", js.undefined)
    @scala.inline
    def setBookmarkHit(value: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit): Self = this.set("bookmarkHit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBookmarkHit: Self = this.set("bookmarkHit", js.undefined)
    @scala.inline
    def setBookmarksVarargs(value: IgVideoPlayerBookmark*): Self = this.set("bookmarks", js.Array(value :_*))
    @scala.inline
    def setBookmarks(value: js.Array[IgVideoPlayerBookmark]): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
    @scala.inline
    def setBrowserControls(value: Boolean): Self = this.set("browserControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserControls: Self = this.set("browserControls", js.undefined)
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = this.set("browserNotSupported", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBrowserNotSupported: Self = this.set("browserNotSupported", js.undefined)
    @scala.inline
    def setBuffering(value: (/* event */ Event, /* ui */ BufferingEventUIParam) => Unit): Self = this.set("buffering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBuffering: Self = this.set("buffering", js.undefined)
    @scala.inline
    def setCenterButtonHideDelay(value: Double): Self = this.set("centerButtonHideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterButtonHideDelay: Self = this.set("centerButtonHideDelay", js.undefined)
    @scala.inline
    def setCommercials(value: IgVideoPlayerCommercials): Self = this.set("commercials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommercials: Self = this.set("commercials", js.undefined)
    @scala.inline
    def setEnded(value: (/* event */ Event, /* ui */ EndedEventUIParam) => Unit): Self = this.set("ended", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnded: Self = this.set("ended", js.undefined)
    @scala.inline
    def setEnterFullScreen(value: (/* event */ Event, /* ui */ EnterFullScreenEventUIParam) => Unit): Self = this.set("enterFullScreen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterFullScreen: Self = this.set("enterFullScreen", js.undefined)
    @scala.inline
    def setExitFullScreen(value: (/* event */ Event, /* ui */ ExitFullScreenEventUIParam) => Unit): Self = this.set("exitFullScreen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExitFullScreen: Self = this.set("exitFullScreen", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgVideoPlayerLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setPaused(value: (/* event */ Event, /* ui */ PausedEventUIParam) => Unit): Self = this.set("paused", js.Any.fromFunction2(value))
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setPlaying(value: (/* event */ Event, /* ui */ PlayingEventUIParam) => Unit): Self = this.set("playing", js.Any.fromFunction2(value))
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    @scala.inline
    def setPosterUrl(value: String): Self = this.set("posterUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterUrl: Self = this.set("posterUrl", js.undefined)
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setProgress(value: (/* event */ Event, /* ui */ ProgressEventUIParam) => Unit): Self = this.set("progress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressLabelFormat(value: String): Self = this.set("progressLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressLabelFormat: Self = this.set("progressLabelFormat", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRelatedVideoClick(value: (/* event */ Event, /* ui */ RelatedVideoClickEventUIParam) => Unit): Self = this.set("relatedVideoClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelatedVideoClick: Self = this.set("relatedVideoClick", js.undefined)
    @scala.inline
    def setRelatedVideosVarargs(value: IgVideoPlayerRelatedVideo*): Self = this.set("relatedVideos", js.Array(value :_*))
    @scala.inline
    def setRelatedVideos(value: js.Array[IgVideoPlayerRelatedVideo]): Self = this.set("relatedVideos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedVideos: Self = this.set("relatedVideos", js.undefined)
    @scala.inline
    def setShowSeekTime(value: Boolean): Self = this.set("showSeekTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSeekTime: Self = this.set("showSeekTime", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: js.Any*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[_]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setVolumeAutohideDelay(value: Double): Self = this.set("volumeAutohideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAutohideDelay: Self = this.set("volumeAutohideDelay", js.undefined)
    @scala.inline
    def setWaiting(value: (/* event */ Event, /* ui */ WaitingEventUIParam) => Unit): Self = this.set("waiting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWaiting: Self = this.set("waiting", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

