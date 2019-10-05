package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartPaneRenderEvent extends StockChartEvent {
  var index: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pane: js.UndefOr[StockChart] = js.undefined
}

object StockChartPaneRenderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: StockChart,
    index: Int | Double = null,
    name: String = null,
    pane: StockChart = null
  ): StockChartPaneRenderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[StockChartPaneRenderEvent]
  }
}

