package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineDragEvent extends SparklineEvent {
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SparklineDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Sparkline,
    axisRanges: js.Any = null,
    originalEvent: js.Any = null
  ): SparklineDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[SparklineDragEvent]
  }
}

