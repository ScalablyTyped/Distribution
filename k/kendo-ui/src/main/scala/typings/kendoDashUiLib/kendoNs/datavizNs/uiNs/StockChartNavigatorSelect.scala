package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSelect extends js.Object {
  var from: js.UndefOr[stdLib.Date] = js.undefined
  var mousewheel: js.UndefOr[scala.Boolean | StockChartNavigatorSelectMousewheel] = js.undefined
  var to: js.UndefOr[stdLib.Date] = js.undefined
}

object StockChartNavigatorSelect {
  @scala.inline
  def apply(
    from: stdLib.Date = null,
    mousewheel: scala.Boolean | StockChartNavigatorSelectMousewheel = null,
    to: stdLib.Date = null
  ): StockChartNavigatorSelect = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[StockChartNavigatorSelect]
  }
}

