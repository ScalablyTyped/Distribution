package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonoscillatorDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAroonoscillatorDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAroonoscillatorDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAroonoscillatorDragDropGuideBoxDefaultOptions = null): PlotAroonoscillatorDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotAroonoscillatorDragDropGuideBoxOptions]
  }
}

