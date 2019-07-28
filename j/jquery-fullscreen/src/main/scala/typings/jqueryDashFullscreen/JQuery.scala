package typings.jqueryDashFullscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * The method returns the current fullscreen element (or true if browser doesn't support this) when fullscreen mode is active,
    * false if not active or null when the browser does not support fullscreen mode at all
    */
  def fullScreen(): Boolean = js.native
  /**
    * You can either switch the whole page or a single HTML element to fullscreen mode
    * This only works when the code was triggered by a user interaction (For example a onclick event on a button). Browsers don't allow entering fullscreen mode without user interaction.
    * Fullscreen mode is always exited via the document but this plugin allows it also via any HTML element. The owner document of the selected HTML element is used
    */
  def fullScreen(fullScreen: Boolean): JQuery | Boolean = js.native
  /**
    * The plugin provides another method for simple fullscreen mode toggling
    */
  def toggleFullScreen(): JQuery | Boolean = js.native
}

