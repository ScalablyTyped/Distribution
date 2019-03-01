package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsLabels extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[ChartSeriesDefaultsLabelsBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[ChartSeriesDefaultsLabelsFrom] = js.undefined
  var margin: js.UndefOr[ChartSeriesDefaultsLabelsMargin] = js.undefined
  var padding: js.UndefOr[ChartSeriesDefaultsLabelsPadding] = js.undefined
  var rotation: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var to: js.UndefOr[ChartSeriesDefaultsLabelsTo] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesDefaultsLabels {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: ChartSeriesDefaultsLabelsBorder = null,
    color: java.lang.String = null,
    font: java.lang.String = null,
    format: java.lang.String = null,
    from: ChartSeriesDefaultsLabelsFrom = null,
    margin: ChartSeriesDefaultsLabelsMargin = null,
    padding: ChartSeriesDefaultsLabelsPadding = null,
    rotation: java.lang.String | scala.Double = null,
    template: java.lang.String | js.Function = null,
    to: ChartSeriesDefaultsLabelsTo = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartSeriesDefaultsLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (from != null) __obj.updateDynamic("from")(from)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartSeriesDefaultsLabels]
  }
}

