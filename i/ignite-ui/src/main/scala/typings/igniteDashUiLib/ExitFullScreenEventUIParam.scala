package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitFullScreenEventUIParam extends js.Object {
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object ExitFullScreenEventUIParam {
  @scala.inline
  def apply(source: java.lang.String = null): ExitFullScreenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ExitFullScreenEventUIParam]
  }
}

