package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisLabels extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorCategoryAxisLabelsBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dateFormats: js.UndefOr[StockChartNavigatorCategoryAxisLabelsDateFormats] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double | StockChartNavigatorCategoryAxisLabelsMargin] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double | StockChartNavigatorCategoryAxisLabelsPadding] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartNavigatorCategoryAxisLabels {
  @scala.inline
  def apply(
    background: String = null,
    border: StockChartNavigatorCategoryAxisLabelsBorder = null,
    color: String = null,
    culture: String = null,
    dateFormats: StockChartNavigatorCategoryAxisLabelsDateFormats = null,
    font: String = null,
    format: String = null,
    margin: Double | StockChartNavigatorCategoryAxisLabelsMargin = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    padding: Double | StockChartNavigatorCategoryAxisLabelsPadding = null,
    rotation: js.UndefOr[Double] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartNavigatorCategoryAxisLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (dateFormats != null) __obj.updateDynamic("dateFormats")(dateFormats.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisLabels]
  }
}

