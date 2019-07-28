package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeScaleLabels extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[LinearGaugeScaleLabelsBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[LinearGaugeScaleLabelsMargin] = js.undefined
  var padding: js.UndefOr[LinearGaugeScaleLabelsPadding] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object LinearGaugeScaleLabels {
  @scala.inline
  def apply(
    background: String = null,
    border: LinearGaugeScaleLabelsBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    margin: LinearGaugeScaleLabelsMargin = null,
    padding: LinearGaugeScaleLabelsPadding = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LinearGaugeScaleLabels = {
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
    __obj.asInstanceOf[LinearGaugeScaleLabels]
  }
}

