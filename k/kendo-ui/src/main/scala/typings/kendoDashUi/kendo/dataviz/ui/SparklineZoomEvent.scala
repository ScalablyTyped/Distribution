package typings.kendoDashUi.kendo.dataviz.ui

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
    delta: Int | Double = null,
    originalEvent: js.Any = null
  ): SparklineZoomEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[SparklineZoomEvent]
  }
}

