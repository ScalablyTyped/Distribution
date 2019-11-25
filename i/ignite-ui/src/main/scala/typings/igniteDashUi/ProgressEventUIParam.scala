package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventUIParam extends js.Object {
  /**
  	 * Get the current time in the video at which the event was fired.
  	 */
  var currentTime: js.UndefOr[Double] = js.undefined
  /**
  	 * Get the video duration in seconds.
  	 */
  var duration: js.UndefOr[Double] = js.undefined
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[String] = js.undefined
}

object ProgressEventUIParam {
  @scala.inline
  def apply(currentTime: Int | Double = null, duration: Int | Double = null, source: String = null): ProgressEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEventUIParam]
  }
}

