package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotApoDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotApoDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotApoDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotApoDragDropGuideBoxDefaultOptions = null): PlotApoDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotApoDragDropGuideBoxOptions]
  }
}

