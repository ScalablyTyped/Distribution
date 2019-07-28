package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTitle extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartTitleBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[ChartTitleMargin] = js.undefined
  var padding: js.UndefOr[ChartTitlePadding] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartTitle {
  @scala.inline
  def apply(
    align: String = null,
    background: String = null,
    border: ChartTitleBorder = null,
    color: String = null,
    font: String = null,
    margin: ChartTitleMargin = null,
    padding: ChartTitlePadding = null,
    position: String = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartTitle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartTitle]
  }
}

