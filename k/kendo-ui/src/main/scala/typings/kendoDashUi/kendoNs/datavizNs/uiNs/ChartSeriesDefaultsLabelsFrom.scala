package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsLabelsFrom extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartSeriesDefaultsLabelsFromBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[ChartSeriesDefaultsLabelsFromMargin] = js.undefined
  var padding: js.UndefOr[ChartSeriesDefaultsLabelsFromPadding] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartSeriesDefaultsLabelsFrom {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartSeriesDefaultsLabelsFromBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    margin: ChartSeriesDefaultsLabelsFromMargin = null,
    padding: ChartSeriesDefaultsLabelsFromPadding = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartSeriesDefaultsLabelsFrom = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartSeriesDefaultsLabelsFrom]
  }
}

