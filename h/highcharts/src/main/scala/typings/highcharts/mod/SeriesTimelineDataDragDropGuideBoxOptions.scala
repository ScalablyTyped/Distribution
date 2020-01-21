package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTimelineDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesTimelineDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesTimelineDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesTimelineDataDragDropGuideBoxDefaultOptions = null): SeriesTimelineDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTimelineDataDragDropGuideBoxOptions]
  }
}

