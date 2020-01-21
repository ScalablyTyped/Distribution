package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsLabelsTo extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartSeriesDefaultsLabelsToBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[ChartSeriesDefaultsLabelsToMargin] = js.undefined
  var padding: js.UndefOr[ChartSeriesDefaultsLabelsToPadding] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartSeriesDefaultsLabelsTo {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartSeriesDefaultsLabelsToBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    margin: ChartSeriesDefaultsLabelsToMargin = null,
    padding: ChartSeriesDefaultsLabelsToPadding = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartSeriesDefaultsLabelsTo = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaultsLabelsTo]
  }
}

