package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemLabelsFrom extends js.Object {
  var background: js.UndefOr[String | js.Function] = js.undefined
  var border: js.UndefOr[ChartSeriesItemLabelsFromBorder] = js.undefined
  var color: js.UndefOr[String | js.Function] = js.undefined
  var font: js.UndefOr[String | js.Function] = js.undefined
  var format: js.UndefOr[String | js.Function] = js.undefined
  var margin: js.UndefOr[ChartSeriesItemLabelsFromMargin] = js.undefined
  var padding: js.UndefOr[ChartSeriesItemLabelsFromPadding] = js.undefined
  var position: js.UndefOr[String | js.Function] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
}

object ChartSeriesItemLabelsFrom {
  @scala.inline
  def apply(
    background: String | js.Function = null,
    border: ChartSeriesItemLabelsFromBorder = null,
    color: String | js.Function = null,
    font: String | js.Function = null,
    format: String | js.Function = null,
    margin: ChartSeriesItemLabelsFromMargin = null,
    padding: ChartSeriesItemLabelsFromPadding = null,
    position: String | js.Function = null,
    template: String | js.Function = null,
    visible: Boolean | js.Function = null
  ): ChartSeriesItemLabelsFrom = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemLabelsFrom]
  }
}

