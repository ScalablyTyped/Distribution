package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRocDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotRocDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotRocDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotRocDragDropGuideBoxDefaultOptions = null): PlotRocDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotRocDragDropGuideBoxOptions]
  }
}

