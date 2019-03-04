package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartPaneRenderEvent extends StockChartEvent {
  var index: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pane: js.UndefOr[StockChart] = js.undefined
}

object StockChartPaneRenderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    index: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pane: StockChart = null
  ): StockChartPaneRenderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[StockChartPaneRenderEvent]
  }
}

