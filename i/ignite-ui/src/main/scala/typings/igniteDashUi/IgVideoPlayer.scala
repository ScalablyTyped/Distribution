package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayer
  extends /**
	 * Option for igVideoPlayer
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether player controls will auto hide when video is not hovered. This is applicable only when Infragistics playback controls are used.
  	 *
  	 */
  var autohide: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the video should start playing immediately after the control is loaded.
  	 *
  	 */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Occurs when the banner is clicked.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bannerClick: js.UndefOr[BannerClickEvent] = js.undefined
  /**
  	 * Occurs when the banner is hidden.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bannerHidden: js.UndefOr[BannerHiddenEvent] = js.undefined
  /**
  	 * Defines the name of the player banner visible event. Fired when the banner has been displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bannerVisible: js.UndefOr[BannerVisibleEvent] = js.undefined
  /**
  	 * Gets/Sets an array of banner objects that will show the banners when the video clip is played.
  	 *
  	 */
  var banners: js.UndefOr[js.Array[IgVideoPlayerBanner]] = js.undefined
  /**
  	 * Occurs when a bookmark is clicked.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.undefined
  /**
  	 * Occurs when a bookmark is hit.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.undefined
  /**
  	 * Gets/Sets an array of bookmarks that will be displayed in the video player control.
  	 *
  	 */
  var bookmarks: js.UndefOr[js.Array[IgVideoPlayerBookmark]] = js.undefined
  /**
  	 * Gets/Sets whether if you want to use the built in browser controls. By default player uses Infragistics playback controls. Note that you may have different look and feel across different browsers if you use the built in browser controls. When this option is set to true, no [commercials](ui.igvideoplayer#options:commercials) will be displayed as they are not supported.
  	 *
  	 */
  var browserControls: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Occurs when browser does not support HTML 5 video.
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.undefined
  /**
  	 * Occurs when a chunk of data is buffered.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var buffering: js.UndefOr[BufferingEvent] = js.undefined
  /**
  	 * Gets/Sets the center big button hide delay.
  	 *
  	 */
  var centerButtonHideDelay: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets an array of commercials objects that will be displayed when the video is playing. Note that [broswerControls](ui.igvideoplayer#options:browserControls) doesn't support commercials.
  	 *
  	 */
  var commercials: js.UndefOr[IgVideoPlayerCommercials] = js.undefined
  /**
  	 * Occurs when the video has ended.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var ended: js.UndefOr[EndedEvent] = js.undefined
  /**
  	 * Occurs when igVideoPlayer enters full screen mode.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var enterFullScreen: js.UndefOr[EnterFullScreenEvent] = js.undefined
  /**
  	 * Occurs when igVideoPlayer exits full screen mode.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var exitFullScreen: js.UndefOr[ExitFullScreenEvent] = js.undefined
  /**
  	 * Gets/Sets whether the video player to be in full screen or not. This is not a pure full screen, because browsers do not allow that. It just sets 100% width and height to the control.
  	 *
  	 */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the height of the control. By default null will stretch the control to fit data, if no other heights are defined.
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgVideoPlayerLocale] = js.undefined
  /**
  	 * Gets/Sets whether the video to start again after it has ended.
  	 *
  	 */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the video volume is muted.
  	 *
  	 */
  var muted: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Occurs when the video is paused.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var paused: js.UndefOr[PausedEvent] = js.undefined
  /**
  	 * Occurs when video gets playing.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var playing: js.UndefOr[PlayingEvent] = js.undefined
  /**
  	 * Gets/Sets a URL to an image to show, when no video data is available.
  	 *
  	 */
  var posterUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets whether to preload load initial data for duration of video. If true it may start buffering the video, but this highly depends on the specific browser implementation.
  	 *
  	 */
  var preload: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Occurs when the video has advanced the playback position.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var progress: js.UndefOr[ProgressEvent] = js.undefined
  /**
  	 * Gets/Sets the format of the video progress label. You should use ${currentTime} to represent current playback position and ${duration} to represent video duration.
  	 *
  	 */
  var progressLabelFormat: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Occurs when a related video is clicked.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var relatedVideoClick: js.UndefOr[RelatedVideoClickEvent] = js.undefined
  /**
  	 * Gets/Sets an array of related videos that will be displayed when video playback has ended.
  	 *
  	 */
  var relatedVideos: js.UndefOr[js.Array[IgVideoPlayerRelatedVideo]] = js.undefined
  /**
  	 * Gets/Sets whether the control seek tool tip will be shown when hovering the video progress bar.
  	 *
  	 */
  var showSeekTime: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets a list of video sources to choose from. Best coded/format is automatically detected by the control. Supported types are depending on the browser and could be one of the following mov, mp4, webm, ogg.
  	 *
  	 */
  var sources: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets/Sets video title.
  	 *
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the video volume. It can be between 0.0 and 1.0.
  	 *
  	 */
  var volume: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets/Sets volume slider auto hide delay. This is applicable only when Infragistics playback controls are used.
  	 *
  	 */
  var volumeAutohideDelay: js.UndefOr[Double] = js.undefined
  /**
  	 * Occurs when igVideoPlayer is waiting for data from the server.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var waiting: js.UndefOr[WaitingEvent] = js.undefined
  /**
  	 * Gets/Sets the width of the control. By default null will stretch the control to fit data, if no other widths are defined.
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgVideoPlayer {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igVideoPlayer
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    autohide: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    bannerClick: (/* event */ Event, /* ui */ BannerClickEventUIParam) => Unit = null,
    bannerHidden: (/* event */ Event, /* ui */ BannerHiddenEventUIParam) => Unit = null,
    bannerVisible: (/* event */ Event, /* ui */ BannerVisibleEventUIParam) => Unit = null,
    banners: js.Array[IgVideoPlayerBanner] = null,
    bookmarkClick: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit = null,
    bookmarkHit: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit = null,
    bookmarks: js.Array[IgVideoPlayerBookmark] = null,
    browserControls: js.UndefOr[Boolean] = js.undefined,
    browserNotSupported: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit = null,
    buffering: (/* event */ Event, /* ui */ BufferingEventUIParam) => Unit = null,
    centerButtonHideDelay: Int | Double = null,
    commercials: IgVideoPlayerCommercials = null,
    ended: (/* event */ Event, /* ui */ EndedEventUIParam) => Unit = null,
    enterFullScreen: (/* event */ Event, /* ui */ EnterFullScreenEventUIParam) => Unit = null,
    exitFullScreen: (/* event */ Event, /* ui */ ExitFullScreenEventUIParam) => Unit = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    language: String = null,
    locale: IgVideoPlayerLocale = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    paused: (/* event */ Event, /* ui */ PausedEventUIParam) => Unit = null,
    playing: (/* event */ Event, /* ui */ PlayingEventUIParam) => Unit = null,
    posterUrl: String = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    progress: (/* event */ Event, /* ui */ ProgressEventUIParam) => Unit = null,
    progressLabelFormat: String = null,
    regional: String | js.Object = null,
    relatedVideoClick: (/* event */ Event, /* ui */ RelatedVideoClickEventUIParam) => Unit = null,
    relatedVideos: js.Array[IgVideoPlayerRelatedVideo] = null,
    showSeekTime: js.UndefOr[Boolean] = js.undefined,
    sources: js.Array[_] = null,
    title: String = null,
    volume: Int | Double = null,
    volumeAutohideDelay: Int | Double = null,
    waiting: (/* event */ Event, /* ui */ WaitingEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgVideoPlayer = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (bannerClick != null) __obj.updateDynamic("bannerClick")(js.Any.fromFunction2(bannerClick))
    if (bannerHidden != null) __obj.updateDynamic("bannerHidden")(js.Any.fromFunction2(bannerHidden))
    if (bannerVisible != null) __obj.updateDynamic("bannerVisible")(js.Any.fromFunction2(bannerVisible))
    if (banners != null) __obj.updateDynamic("banners")(banners.asInstanceOf[js.Any])
    if (bookmarkClick != null) __obj.updateDynamic("bookmarkClick")(js.Any.fromFunction2(bookmarkClick))
    if (bookmarkHit != null) __obj.updateDynamic("bookmarkHit")(js.Any.fromFunction2(bookmarkHit))
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (!js.isUndefined(browserControls)) __obj.updateDynamic("browserControls")(browserControls.asInstanceOf[js.Any])
    if (browserNotSupported != null) __obj.updateDynamic("browserNotSupported")(js.Any.fromFunction2(browserNotSupported))
    if (buffering != null) __obj.updateDynamic("buffering")(js.Any.fromFunction2(buffering))
    if (centerButtonHideDelay != null) __obj.updateDynamic("centerButtonHideDelay")(centerButtonHideDelay.asInstanceOf[js.Any])
    if (commercials != null) __obj.updateDynamic("commercials")(commercials.asInstanceOf[js.Any])
    if (ended != null) __obj.updateDynamic("ended")(js.Any.fromFunction2(ended))
    if (enterFullScreen != null) __obj.updateDynamic("enterFullScreen")(js.Any.fromFunction2(enterFullScreen))
    if (exitFullScreen != null) __obj.updateDynamic("exitFullScreen")(js.Any.fromFunction2(exitFullScreen))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(js.Any.fromFunction2(paused))
    if (playing != null) __obj.updateDynamic("playing")(js.Any.fromFunction2(playing))
    if (posterUrl != null) __obj.updateDynamic("posterUrl")(posterUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    if (progressLabelFormat != null) __obj.updateDynamic("progressLabelFormat")(progressLabelFormat.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (relatedVideoClick != null) __obj.updateDynamic("relatedVideoClick")(js.Any.fromFunction2(relatedVideoClick))
    if (relatedVideos != null) __obj.updateDynamic("relatedVideos")(relatedVideos.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeekTime)) __obj.updateDynamic("showSeekTime")(showSeekTime.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (volumeAutohideDelay != null) __obj.updateDynamic("volumeAutohideDelay")(volumeAutohideDelay.asInstanceOf[js.Any])
    if (waiting != null) __obj.updateDynamic("waiting")(js.Any.fromFunction2(waiting))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayer]
  }
}

