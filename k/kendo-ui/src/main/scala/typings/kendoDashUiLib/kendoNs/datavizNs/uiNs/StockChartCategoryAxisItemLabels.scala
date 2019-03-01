package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemLabels extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartCategoryAxisItemLabelsBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dateFormats: js.UndefOr[js.Any] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Double | js.Any] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartCategoryAxisItemLabels {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartCategoryAxisItemLabelsBorder = null,
    color: java.lang.String = null,
    culture: java.lang.String = null,
    dateFormats: js.Any = null,
    font: java.lang.String = null,
    format: java.lang.String = null,
    margin: scala.Double | js.Any = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Double | js.Any = null,
    rotation: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    template: java.lang.String | js.Function = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StockChartCategoryAxisItemLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (dateFormats != null) __obj.updateDynamic("dateFormats")(dateFormats)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartCategoryAxisItemLabels]
  }
}

