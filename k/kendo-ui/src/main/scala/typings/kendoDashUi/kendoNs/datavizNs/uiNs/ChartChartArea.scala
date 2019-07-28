package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartChartArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartChartAreaBorder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[ChartChartAreaMargin] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartChartArea {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartChartAreaBorder = null,
    height: Int | Double = null,
    margin: ChartChartAreaMargin = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): ChartChartArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartChartArea]
  }
}

