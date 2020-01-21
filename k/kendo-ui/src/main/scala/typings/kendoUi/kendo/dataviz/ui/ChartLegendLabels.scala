package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendLabels extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[ChartLegendLabelsMargin] = js.undefined
  var padding: js.UndefOr[ChartLegendLabelsPadding] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object ChartLegendLabels {
  @scala.inline
  def apply(
    color: String = null,
    font: String = null,
    margin: ChartLegendLabelsMargin = null,
    padding: ChartLegendLabelsPadding = null,
    template: String | js.Function = null
  ): ChartLegendLabels = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendLabels]
  }
}

