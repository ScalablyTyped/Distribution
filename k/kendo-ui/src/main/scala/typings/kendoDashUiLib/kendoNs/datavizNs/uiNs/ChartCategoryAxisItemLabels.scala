package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemLabels extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[ChartCategoryAxisItemLabelsBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dateFormats: js.UndefOr[ChartCategoryAxisItemLabelsDateFormats] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[ChartCategoryAxisItemLabelsMargin] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[ChartCategoryAxisItemLabelsPadding] = js.undefined
  var rotation: js.UndefOr[java.lang.String | scala.Double | ChartCategoryAxisItemLabelsRotation] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartCategoryAxisItemLabels {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: ChartCategoryAxisItemLabelsBorder = null,
    color: java.lang.String = null,
    culture: java.lang.String = null,
    dateFormats: ChartCategoryAxisItemLabelsDateFormats = null,
    font: java.lang.String = null,
    format: java.lang.String = null,
    margin: ChartCategoryAxisItemLabelsMargin = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    padding: ChartCategoryAxisItemLabelsPadding = null,
    rotation: java.lang.String | scala.Double | ChartCategoryAxisItemLabelsRotation = null,
    skip: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    template: java.lang.String | js.Function = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartCategoryAxisItemLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (dateFormats != null) __obj.updateDynamic("dateFormats")(dateFormats)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartCategoryAxisItemLabels]
  }
}

