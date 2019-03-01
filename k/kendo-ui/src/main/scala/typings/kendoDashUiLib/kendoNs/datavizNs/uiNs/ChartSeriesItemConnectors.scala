package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemConnectors extends js.Object {
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartSeriesItemConnectors {
  @scala.inline
  def apply(
    color: java.lang.String | js.Function = null,
    padding: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ChartSeriesItemConnectors = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemConnectors]
  }
}

