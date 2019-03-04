package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomEvent extends ChartEvent {
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  var delta: js.UndefOr[scala.Double] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ChartZoomEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Chart,
    axisRanges: js.Any = null,
    delta: scala.Int | scala.Double = null,
    originalEvent: js.Any = null
  ): ChartZoomEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[ChartZoomEvent]
  }
}

