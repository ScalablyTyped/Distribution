package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSeriesDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Style options for the guide box
    * default state.
    */
  var default: js.UndefOr[PlotSeriesDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSeriesDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSeriesDragDropGuideBoxDefaultOptions = null): PlotSeriesDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSeriesDragDropGuideBoxOptions]
  }
}

