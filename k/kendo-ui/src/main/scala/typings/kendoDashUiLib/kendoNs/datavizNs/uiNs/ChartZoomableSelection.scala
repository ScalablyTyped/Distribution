package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomableSelection extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var lock: js.UndefOr[java.lang.String] = js.undefined
}

object ChartZoomableSelection {
  @scala.inline
  def apply(key: java.lang.String = null, lock: java.lang.String = null): ChartZoomableSelection = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (lock != null) __obj.updateDynamic("lock")(lock)
    __obj.asInstanceOf[ChartZoomableSelection]
  }
}

