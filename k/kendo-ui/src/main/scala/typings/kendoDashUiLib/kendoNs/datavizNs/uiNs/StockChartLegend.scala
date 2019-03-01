package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegend extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartLegendBorder] = js.undefined
  var inactiveItems: js.UndefOr[StockChartLegendInactiveItems] = js.undefined
  var item: js.UndefOr[StockChartLegendItem] = js.undefined
  var labels: js.UndefOr[StockChartLegendLabels] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double | js.Any] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartLegend {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartLegendBorder = null,
    inactiveItems: StockChartLegendInactiveItems = null,
    item: StockChartLegendItem = null,
    labels: StockChartLegendLabels = null,
    margin: scala.Double | js.Any = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    padding: scala.Double | js.Any = null,
    position: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StockChartLegend = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (inactiveItems != null) __obj.updateDynamic("inactiveItems")(inactiveItems)
    if (item != null) __obj.updateDynamic("item")(item)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartLegend]
  }
}

