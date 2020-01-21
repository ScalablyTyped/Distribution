package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWaterfallDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotWaterfallDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotWaterfallDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotWaterfallDragDropGuideBoxDefaultOptions = null): PlotWaterfallDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWaterfallDragDropGuideBoxOptions]
  }
}

