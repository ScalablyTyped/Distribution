package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotTreemapDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotTreemapDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotTreemapDragDropGuideBoxDefaultOptions = null): PlotTreemapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotTreemapDragDropGuideBoxOptions]
  }
}

