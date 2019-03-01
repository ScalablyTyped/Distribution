package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemErrorBars extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var endCaps: js.UndefOr[scala.Boolean] = js.undefined
  var line: js.UndefOr[ChartSeriesItemErrorBarsLine] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | js.Any | js.Function] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
  var xValue: js.UndefOr[java.lang.String | scala.Double | js.Any | js.Function] = js.undefined
  var yValue: js.UndefOr[java.lang.String | scala.Double | js.Any | js.Function] = js.undefined
}

object ChartSeriesItemErrorBars {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    endCaps: js.UndefOr[scala.Boolean] = js.undefined,
    line: ChartSeriesItemErrorBarsLine = null,
    value: java.lang.String | scala.Double | js.Any | js.Function = null,
    visual: js.Function = null,
    xValue: java.lang.String | scala.Double | js.Any | js.Function = null,
    yValue: java.lang.String | scala.Double | js.Any | js.Function = null
  ): ChartSeriesItemErrorBars = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(endCaps)) __obj.updateDynamic("endCaps")(endCaps)
    if (line != null) __obj.updateDynamic("line")(line)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual)
    if (xValue != null) __obj.updateDynamic("xValue")(xValue.asInstanceOf[js.Any])
    if (yValue != null) __obj.updateDynamic("yValue")(yValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemErrorBars]
  }
}

