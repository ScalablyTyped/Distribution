package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSelectEvent extends ChartEvent {
  var axis: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[js.Any] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object ChartSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chart,
    axis: js.Any = null,
    from: js.Any = null,
    to: js.Any = null
  ): ChartSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ChartSelectEvent]
  }
}

