package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAdDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAdDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAdDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAdDragDropGuideBoxDefaultOptions = null): PlotAdDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotAdDragDropGuideBoxOptions]
  }
}

