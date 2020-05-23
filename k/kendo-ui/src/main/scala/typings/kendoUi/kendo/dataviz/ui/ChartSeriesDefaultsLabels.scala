package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsLabels extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartSeriesDefaultsLabelsBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[ChartSeriesDefaultsLabelsFrom] = js.undefined
  var margin: js.UndefOr[Double | ChartSeriesDefaultsLabelsMargin] = js.undefined
  var padding: js.UndefOr[Double | ChartSeriesDefaultsLabelsPadding] = js.undefined
  var rotation: js.UndefOr[String | Double] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var to: js.UndefOr[ChartSeriesDefaultsLabelsTo] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesDefaultsLabels {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartSeriesDefaultsLabelsBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    from: ChartSeriesDefaultsLabelsFrom = null,
    margin: Double | ChartSeriesDefaultsLabelsMargin = null,
    padding: Double | ChartSeriesDefaultsLabelsPadding = null,
    rotation: String | Double = null,
    template: String | js.Function = null,
    to: ChartSeriesDefaultsLabelsTo = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartSeriesDefaultsLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaultsLabels]
  }
}

