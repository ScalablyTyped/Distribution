package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgVideoPlayerMutableBuilder[Self <: IgVideoPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setBannerClick(value: (/* event */ Event, /* ui */ BannerClickEventUIParam) => Unit): Self = StObject.set(x, "bannerClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBannerClickUndefined: Self = StObject.set(x, "bannerClick", js.undefined)
    
    @scala.inline
    def setBannerHidden(value: (/* event */ Event, /* ui */ BannerHiddenEventUIParam) => Unit): Self = StObject.set(x, "bannerHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBannerHiddenUndefined: Self = StObject.set(x, "bannerHidden", js.undefined)
    
    @scala.inline
    def setBannerVisible(value: (/* event */ Event, /* ui */ BannerVisibleEventUIParam) => Unit): Self = StObject.set(x, "bannerVisible", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBannerVisibleUndefined: Self = StObject.set(x, "bannerVisible", js.undefined)
    
    @scala.inline
    def setBanners(value: js.Array[IgVideoPlayerBanner]): Self = StObject.set(x, "banners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannersUndefined: Self = StObject.set(x, "banners", js.undefined)
    
    @scala.inline
    def setBannersVarargs(value: IgVideoPlayerBanner*): Self = StObject.set(x, "banners", js.Array(value :_*))
    
    @scala.inline
    def setBookmarkClick(value: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit): Self = StObject.set(x, "bookmarkClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBookmarkClickUndefined: Self = StObject.set(x, "bookmarkClick", js.undefined)
    
    @scala.inline
    def setBookmarkHit(value: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit): Self = StObject.set(x, "bookmarkHit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBookmarkHitUndefined: Self = StObject.set(x, "bookmarkHit", js.undefined)
    
    @scala.inline
    def setBookmarks(value: js.Array[IgVideoPlayerBookmark]): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    @scala.inline
    def setBookmarksVarargs(value: IgVideoPlayerBookmark*): Self = StObject.set(x, "bookmarks", js.Array(value :_*))
    
    @scala.inline
    def setBrowserControls(value: Boolean): Self = StObject.set(x, "browserControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserControlsUndefined: Self = StObject.set(x, "browserControls", js.undefined)
    
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = StObject.set(x, "browserNotSupported", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBrowserNotSupportedUndefined: Self = StObject.set(x, "browserNotSupported", js.undefined)
    
    @scala.inline
    def setBuffering(value: (/* event */ Event, /* ui */ BufferingEventUIParam) => Unit): Self = StObject.set(x, "buffering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBufferingUndefined: Self = StObject.set(x, "buffering", js.undefined)
    
    @scala.inline
    def setCenterButtonHideDelay(value: Double): Self = StObject.set(x, "centerButtonHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterButtonHideDelayUndefined: Self = StObject.set(x, "centerButtonHideDelay", js.undefined)
    
    @scala.inline
    def setCommercials(value: IgVideoPlayerCommercials): Self = StObject.set(x, "commercials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommercialsUndefined: Self = StObject.set(x, "commercials", js.undefined)
    
    @scala.inline
    def setEnded(value: (/* event */ Event, /* ui */ EndedEventUIParam) => Unit): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
    
    @scala.inline
    def setEnterFullScreen(value: (/* event */ Event, /* ui */ EnterFullScreenEventUIParam) => Unit): Self = StObject.set(x, "enterFullScreen", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterFullScreenUndefined: Self = StObject.set(x, "enterFullScreen", js.undefined)
    
    @scala.inline
    def setExitFullScreen(value: (/* event */ Event, /* ui */ ExitFullScreenEventUIParam) => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitFullScreenUndefined: Self = StObject.set(x, "exitFullScreen", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgVideoPlayerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setPaused(value: (/* event */ Event, /* ui */ PausedEventUIParam) => Unit): Self = StObject.set(x, "paused", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setPlaying(value: (/* event */ Event, /* ui */ PlayingEventUIParam) => Unit): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    @scala.inline
    def setPosterUrl(value: String): Self = StObject.set(x, "posterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUrlUndefined: Self = StObject.set(x, "posterUrl", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setProgress(value: (/* event */ Event, /* ui */ ProgressEventUIParam) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgressLabelFormat(value: String): Self = StObject.set(x, "progressLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressLabelFormatUndefined: Self = StObject.set(x, "progressLabelFormat", js.undefined)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRelatedVideoClick(value: (/* event */ Event, /* ui */ RelatedVideoClickEventUIParam) => Unit): Self = StObject.set(x, "relatedVideoClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelatedVideoClickUndefined: Self = StObject.set(x, "relatedVideoClick", js.undefined)
    
    @scala.inline
    def setRelatedVideos(value: js.Array[IgVideoPlayerRelatedVideo]): Self = StObject.set(x, "relatedVideos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedVideosUndefined: Self = StObject.set(x, "relatedVideos", js.undefined)
    
    @scala.inline
    def setRelatedVideosVarargs(value: IgVideoPlayerRelatedVideo*): Self = StObject.set(x, "relatedVideos", js.Array(value :_*))
    
    @scala.inline
    def setShowSeekTime(value: Boolean): Self = StObject.set(x, "showSeekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSeekTimeUndefined: Self = StObject.set(x, "showSeekTime", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[_]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: js.Any*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAutohideDelay(value: Double): Self = StObject.set(x, "volumeAutohideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeAutohideDelayUndefined: Self = StObject.set(x, "volumeAutohideDelay", js.undefined)
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    @scala.inline
    def setWaiting(value: (/* event */ Event, /* ui */ WaitingEventUIParam) => Unit): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
