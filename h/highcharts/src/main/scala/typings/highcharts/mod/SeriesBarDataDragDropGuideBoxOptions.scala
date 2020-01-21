package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBarDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesBarDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesBarDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesBarDataDragDropGuideBoxDefaultOptions = null): SeriesBarDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBarDataDragDropGuideBoxOptions]
  }
}

