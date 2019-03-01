package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeScaleLabels extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[RadialGaugeScaleLabelsBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[RadialGaugeScaleLabelsMargin] = js.undefined
  var padding: js.UndefOr[RadialGaugeScaleLabelsPadding] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object RadialGaugeScaleLabels {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: RadialGaugeScaleLabelsBorder = null,
    color: java.lang.String = null,
    font: java.lang.String = null,
    format: java.lang.String = null,
    margin: RadialGaugeScaleLabelsMargin = null,
    padding: RadialGaugeScaleLabelsPadding = null,
    position: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): RadialGaugeScaleLabels = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[RadialGaugeScaleLabels]
  }
}

