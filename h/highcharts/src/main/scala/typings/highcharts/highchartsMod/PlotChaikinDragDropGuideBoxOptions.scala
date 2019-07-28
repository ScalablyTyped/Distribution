package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotChaikinDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotChaikinDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotChaikinDragDropGuideBoxDefaultOptions = null): PlotChaikinDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotChaikinDragDropGuideBoxOptions]
  }
}

