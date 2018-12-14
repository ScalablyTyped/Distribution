package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgVideoPlayer
  extends /**
	 * Option for igVideoPlayer
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether player controls will auto hide when video is not hovered. This is applicable only when Infragistics playback controls are used.
  	 *
  	 */
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the video should start playing immediately after the control is loaded.
  	 *
  	 */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
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
  var browserControls: js.UndefOr[scala.Boolean] = js.undefined
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
  var centerButtonHideDelay: js.UndefOr[scala.Double] = js.undefined
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
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the height of the control. By default null will stretch the control to fit data, if no other heights are defined.
  	 *
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgVideoPlayerLocale] = js.undefined
  /**
  	 * Gets/Sets whether the video to start again after it has ended.
  	 *
  	 */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets whether the video volume is muted.
  	 *
  	 */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
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
  var posterUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets whether to preload load initial data for duration of video. If true it may start buffering the video, but this highly depends on the specific browser implementation.
  	 *
  	 */
  var preload: js.UndefOr[scala.Boolean] = js.undefined
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
  var progressLabelFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var showSeekTime: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets a list of video sources to choose from. Best coded/format is automatically detected by the control. Supported types are depending on the browser and could be one of the following mov, mp4, webm, ogg.
  	 *
  	 */
  var sources: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets/Sets video title.
  	 *
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the video volume. It can be between 0.0 and 1.0.
  	 *
  	 */
  var volume: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets volume slider auto hide delay. This is applicable only when Infragistics playback controls are used.
  	 *
  	 */
  var volumeAutohideDelay: js.UndefOr[scala.Double] = js.undefined
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
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

