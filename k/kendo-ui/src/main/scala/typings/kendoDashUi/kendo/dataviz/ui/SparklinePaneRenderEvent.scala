package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinePaneRenderEvent extends SparklineEvent {
  var index: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pane: js.UndefOr[typings.kendoDashUi.kendo.dataviz.ChartPane] = js.undefined
}

object SparklinePaneRenderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sparkline,
    index: Int | Double = null,
    name: String = null,
    pane: typings.kendoDashUi.kendo.dataviz.ChartPane = null
  ): SparklinePaneRenderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[SparklinePaneRenderEvent]
  }
}

