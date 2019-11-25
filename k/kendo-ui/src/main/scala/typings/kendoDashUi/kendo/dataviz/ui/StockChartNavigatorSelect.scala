package typings.kendoDashUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSelect extends js.Object {
  var from: js.UndefOr[Date] = js.undefined
  var mousewheel: js.UndefOr[Boolean | StockChartNavigatorSelectMousewheel] = js.undefined
  var to: js.UndefOr[Date] = js.undefined
}

object StockChartNavigatorSelect {
  @scala.inline
  def apply(
    from: Date = null,
    mousewheel: Boolean | StockChartNavigatorSelectMousewheel = null,
    to: Date = null
  ): StockChartNavigatorSelect = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSelect]
  }
}

