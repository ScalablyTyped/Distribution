package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesWordcloudDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesWordcloudDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesWordcloudDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesWordcloudDataDragDropGuideBoxDefaultOptions = null): SeriesWordcloudDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesWordcloudDataDragDropGuideBoxOptions]
  }
}

