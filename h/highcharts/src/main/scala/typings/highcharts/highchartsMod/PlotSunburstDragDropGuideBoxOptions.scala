package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotSunburstDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSunburstDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSunburstDragDropGuideBoxDefaultOptions = null): PlotSunburstDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSunburstDragDropGuideBoxOptions]
  }
}

