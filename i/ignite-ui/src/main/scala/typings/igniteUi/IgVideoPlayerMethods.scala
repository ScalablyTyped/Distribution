package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayerMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igvideoplayer#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igvideoplayer#options:language) or [locale](ui.igvideoplayer#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  /**
  	 * Gets/Sets the current time of the playing video.
  	 *
  	 * @param val Specify the playback position in seconds to navigate to.
  	 */
  def currentTime(`val`: Double): Double = js.native
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Get the current duration of the played video. It may be NaN if duration is still not loaded or the video is a live stream.
  	 */
  def duration(): Double = js.native
  /**
  	 * Get whether the current played video has ended.
  	 */
  def ended(): Boolean = js.native
  /**
  	 * Hide the add message if shown.
  	 */
  def hideAdMessage(): Unit = js.native
  /**
  	 * Hide the ad banner, if there is such.
  	 *
  	 * @param index Specify the index of the banner from the banners array.
  	 */
  def hideBanner(index: Double): Unit = js.native
  /**
  	 * Pause the currently playing video if any.
  	 */
  def pause(): Unit = js.native
  /**
  	 * Returns whether the currently played video is paused.
  	 */
  def paused(): Boolean = js.native
  /**
  	 * Start playing current loaded video if any.
  	 */
  def play(): Unit = js.native
  /**
  	 * Play a linked commercial for this video.
  	 *
  	 * @param commercial Specify the linked commercial to play.
  	 */
  def playCommercial(commercial: js.Object): Unit = js.native
  /**
  	 * Resets the commercials, to be shown again.
  	 */
  def resetCommercialsShow(): Unit = js.native
  /**
  	 * Get a screenshot of the current video frame. It returns a canvas object that you can position and show on the page. This depends on the browser support for canvas.
  	 *
  	 * @param scaleFactor Specify scale factor between 0 and 1.
  	 */
  def screenshot(): js.Object = js.native
  def screenshot(scaleFactor: Double): js.Object = js.native
  /**
  	 * Get whether the player is seeking to find the new playback position specified.
  	 */
  def seeking(): Boolean = js.native
  /**
  	 * Shows the ad banner, if there is such.
  	 *
  	 * @param index Specify the index of the banner from the banners array.
  	 */
  def showBanner(index: Double): Unit = js.native
  /**
  	 * Get whether the current browser supports H.264 codec.
  	 */
  def supportsH264BaselineVideo(): Boolean = js.native
  /**
  	 * Get whether the current browser supports Theora codec.
  	 */
  def supportsOggTheoraVideo(): Boolean = js.native
  /**
  	 * Get whether the current browser supports video tag.
  	 */
  def supportsVideo(): Boolean = js.native
  /**
  	 * Get whether the current browser supports WEBM codec.
  	 */
  def supportsWebmVideo(): Boolean = js.native
  /**
  	 * Toggle control play state. If video is playing it will pause, if video is paused it will play.
  	 */
  def togglePlay(): Unit = js.native
  /**
  	 * Returns the element on which the widget was instantiated
  	 */
  def widget(): Unit = js.native
}

