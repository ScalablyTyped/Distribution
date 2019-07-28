package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitFullScreenEventUIParam extends js.Object {
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[String] = js.undefined
}

object ExitFullScreenEventUIParam {
  @scala.inline
  def apply(source: String = null): ExitFullScreenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ExitFullScreenEventUIParam]
  }
}

