package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineZoomEvent extends SparklineEvent {
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SparklineZoomEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sparkline,
    axisRanges: js.Any = null,
    delta: js.UndefOr[Double] = js.undefined,
    originalEvent: js.Any = null
  ): SparklineZoomEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineZoomEvent]
  }
}

