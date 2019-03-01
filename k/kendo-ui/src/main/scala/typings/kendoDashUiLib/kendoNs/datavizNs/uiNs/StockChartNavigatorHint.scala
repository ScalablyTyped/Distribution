package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorHint extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartNavigatorHint {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StockChartNavigatorHint = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigatorHint]
  }
}

