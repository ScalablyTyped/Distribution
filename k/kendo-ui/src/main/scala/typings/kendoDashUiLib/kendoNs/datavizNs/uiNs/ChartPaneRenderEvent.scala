package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPaneRenderEvent extends ChartEvent {
  var index: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pane: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.ChartPane] = js.undefined
}

object ChartPaneRenderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chart,
    index: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pane: kendoDashUiLib.kendoNs.datavizNs.ChartPane = null
  ): ChartPaneRenderEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[ChartPaneRenderEvent]
  }
}

