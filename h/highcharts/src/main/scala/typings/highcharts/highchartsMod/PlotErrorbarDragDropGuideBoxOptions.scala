package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotErrorbarDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotErrorbarDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotErrorbarDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotErrorbarDragDropGuideBoxDefaultOptions = null): PlotErrorbarDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotErrorbarDragDropGuideBoxOptions]
  }
}

