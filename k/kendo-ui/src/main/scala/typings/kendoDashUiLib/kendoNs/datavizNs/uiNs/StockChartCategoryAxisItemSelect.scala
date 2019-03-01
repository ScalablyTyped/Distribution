package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemSelect extends js.Object {
  var from: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var mousewheel: js.UndefOr[StockChartCategoryAxisItemSelectMousewheel] = js.undefined
  var to: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
}

object StockChartCategoryAxisItemSelect {
  @scala.inline
  def apply(
    from: java.lang.String | stdLib.Date = null,
    max: js.Any = null,
    min: js.Any = null,
    mousewheel: StockChartCategoryAxisItemSelectMousewheel = null,
    to: java.lang.String | stdLib.Date = null
  ): StockChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartCategoryAxisItemSelect]
  }
}

