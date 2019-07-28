package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltip extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartTooltipBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[ChartTooltipPadding] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var sharedTemplate: js.UndefOr[String | js.Function] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartTooltip {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartTooltipBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    opacity: Int | Double = null,
    padding: ChartTooltipPadding = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    sharedTemplate: String | js.Function = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (sharedTemplate != null) __obj.updateDynamic("sharedTemplate")(sharedTemplate.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartTooltip]
  }
}

