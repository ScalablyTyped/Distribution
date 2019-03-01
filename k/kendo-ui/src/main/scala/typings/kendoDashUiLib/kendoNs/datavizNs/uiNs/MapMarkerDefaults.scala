package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerDefaults extends js.Object {
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[MapMarkerDefaultsTooltip] = js.undefined
}

object MapMarkerDefaults {
  @scala.inline
  def apply(shape: java.lang.String = null, tooltip: MapMarkerDefaultsTooltip = null): MapMarkerDefaults = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MapMarkerDefaults]
  }
}

