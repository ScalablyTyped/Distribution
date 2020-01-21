package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferingEventUIParam extends js.Object {
  /**
  	 * Get buffered percentage.
  	 */
  var buffered: js.UndefOr[Double] = js.undefined
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[String] = js.undefined
}

object BufferingEventUIParam {
  @scala.inline
  def apply(buffered: Int | Double = null, source: String = null): BufferingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (buffered != null) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferingEventUIParam]
  }
}

