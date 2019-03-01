package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemMarkersFromBorder extends js.Object {
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var width: js.UndefOr[scala.Double | js.Function] = js.undefined
}

object ChartSeriesItemMarkersFromBorder {
  @scala.inline
  def apply(color: java.lang.String | js.Function = null, width: scala.Double | js.Function = null): ChartSeriesItemMarkersFromBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemMarkersFromBorder]
  }
}

