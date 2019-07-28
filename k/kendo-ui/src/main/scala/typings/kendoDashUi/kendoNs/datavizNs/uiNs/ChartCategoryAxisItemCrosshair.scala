package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[ChartCategoryAxisItemCrosshairTooltip] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartCategoryAxisItemCrosshair {
  @scala.inline
  def apply(
    color: String = null,
    dashType: String = null,
    opacity: Int | Double = null,
    tooltip: ChartCategoryAxisItemCrosshairTooltip = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ChartCategoryAxisItemCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCategoryAxisItemCrosshair]
  }
}

