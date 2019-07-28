package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVectorDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotVectorDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotVectorDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotVectorDragDropGuideBoxDefaultOptions = null): PlotVectorDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotVectorDragDropGuideBoxOptions]
  }
}

