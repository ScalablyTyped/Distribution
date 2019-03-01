package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendLabels extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[ChartLegendLabelsMargin] = js.undefined
  var padding: js.UndefOr[ChartLegendLabelsPadding] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object ChartLegendLabels {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: java.lang.String = null,
    margin: ChartLegendLabelsMargin = null,
    padding: ChartLegendLabelsPadding = null,
    template: java.lang.String | js.Function = null
  ): ChartLegendLabels = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendLabels]
  }
}

