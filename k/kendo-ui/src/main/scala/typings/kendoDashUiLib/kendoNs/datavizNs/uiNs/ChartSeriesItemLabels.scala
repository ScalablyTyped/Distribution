package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemLabels extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var border: js.UndefOr[ChartSeriesItemLabelsBorder] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var font: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var from: js.UndefOr[ChartSeriesItemLabelsFrom] = js.undefined
  var margin: js.UndefOr[ChartSeriesItemLabelsMargin] = js.undefined
  var padding: js.UndefOr[ChartSeriesItemLabelsPadding] = js.undefined
  var position: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var rotation: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var to: js.UndefOr[ChartSeriesItemLabelsTo] = js.undefined
  var visible: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesItemLabels {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    background: java.lang.String | js.Function = null,
    border: ChartSeriesItemLabelsBorder = null,
    color: java.lang.String | js.Function = null,
    distance: scala.Int | scala.Double = null,
    font: java.lang.String | js.Function = null,
    format: java.lang.String | js.Function = null,
    from: ChartSeriesItemLabelsFrom = null,
    margin: ChartSeriesItemLabelsMargin = null,
    padding: ChartSeriesItemLabelsPadding = null,
    position: java.lang.String | js.Function = null,
    rotation: java.lang.String | scala.Double = null,
    template: java.lang.String | js.Function = null,
    to: ChartSeriesItemLabelsTo = null,
    visible: scala.Boolean | js.Function = null,
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

