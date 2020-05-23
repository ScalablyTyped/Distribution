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
  def apply(buffered: js.UndefOr[Double] = js.undefined, source: String = null): BufferingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferingEventUIParam]
  }
}

