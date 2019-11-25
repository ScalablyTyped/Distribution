package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndedEventUIParam extends js.Object {
  /**
  	 * Get the video duration in seconds.
  	 */
  var duration: js.UndefOr[Double] = js.undefined
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[String] = js.undefined
}

object EndedEventUIParam {
  @scala.inline
  def apply(duration: Int | Double = null, source: String = null): EndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndedEventUIParam]
  }
}

