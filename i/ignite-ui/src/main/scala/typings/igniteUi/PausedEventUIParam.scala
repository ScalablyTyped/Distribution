package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PausedEventUIParam extends js.Object {
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

object PausedEventUIParam {
  @scala.inline
  def apply(
    currentTime: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    source: String = null
  ): PausedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEventUIParam]
  }
}

