package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineTooltip extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[SparklineTooltipBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double | js.Any] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var sharedTemplate: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SparklineTooltip {
  @scala.inline
  def apply(
    background: String = null,
    border: SparklineTooltipBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    padding: Double | js.Any = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    sharedTemplate: String = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SparklineTooltip = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (sharedTemplate != null) __obj.updateDynamic("sharedTemplate")(sharedTemplate)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SparklineTooltip]
  }
}

