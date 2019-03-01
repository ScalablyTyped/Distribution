package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomableMousewheel extends js.Object {
  var lock: js.UndefOr[java.lang.String] = js.undefined
}

object ChartZoomableMousewheel {
  @scala.inline
  def apply(lock: java.lang.String = null): ChartZoomableMousewheel = {
    val __obj = js.Dynamic.literal()
    if (lock != null) __obj.updateDynamic("lock")(lock)
    __obj.asInstanceOf[ChartZoomableMousewheel]
  }
}

