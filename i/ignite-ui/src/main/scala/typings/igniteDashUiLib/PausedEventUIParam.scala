package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PausedEventUIParam extends js.Object {
  /**
  	 * Get the current time in the video at which the event was fired.
  	 */
  var currentTime: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Get the video duration in seconds.
  	 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object PausedEventUIParam {
  @scala.inline
  def apply(
    currentTime: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    source: java.lang.String = null
  ): PausedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PausedEventUIParam]
  }
}

