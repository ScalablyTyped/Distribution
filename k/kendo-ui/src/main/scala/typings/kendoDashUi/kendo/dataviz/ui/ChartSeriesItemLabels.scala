package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemLabels extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String | js.Function] = js.undefined
  var border: js.UndefOr[ChartSeriesItemLabelsBorder] = js.undefined
  var color: js.UndefOr[String | js.Function] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[String | js.Function] = js.undefined
  var format: js.UndefOr[String | js.Function] = js.undefined
  var from: js.UndefOr[ChartSeriesItemLabelsFrom] = js.undefined
  var margin: js.UndefOr[ChartSeriesItemLabelsMargin] = js.undefined
  var padding: js.UndefOr[ChartSeriesItemLabelsPadding] = js.undefined
  var position: js.UndefOr[String | js.Function] = js.undefined
  var rotation: js.UndefOr[String | Double] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var to: js.UndefOr[ChartSeriesItemLabelsTo] = js.undefined
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesItemLabels {
  @scala.inline
  def apply(
    align: String = null,
    background: String | js.Function = null,
    border: ChartSeriesItemLabelsBorder = null,
    color: String | js.Function = null,
    distance: Int | Double = null,
    font: String | js.Function = null,
    format: String | js.Function = null,
    from: ChartSeriesItemLabelsFrom = null,
    margin: ChartSeriesItemLabelsMargin = null,
    padding: ChartSeriesItemLabelsPadding = null,
    position: String | js.Function = null,
    rotation: String | Double = null,
    template: String | js.Function = null,
    to: ChartSeriesItemLabelsTo = null,
    visible: Boolean | js.Function = null,
    visual: js.Function = null
  ): ChartSeriesItemLabels = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartSeriesItemLabels]
  }
}

