package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemSelect extends js.Object {
  var from: js.UndefOr[String | Date] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var mousewheel: js.UndefOr[StockChartCategoryAxisItemSelectMousewheel] = js.undefined
  var to: js.UndefOr[String | Date] = js.undefined
}

object StockChartCategoryAxisItemSelect {
  @scala.inline
  def apply(
    from: String | Date = null,
    max: js.Any = null,
    min: js.Any = null,
    mousewheel: StockChartCategoryAxisItemSelectMousewheel = null,
    to: String | Date = null
  ): StockChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartCategoryAxisItemSelect]
  }
}

