package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPpoDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPpoDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPpoDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPpoDragDropGuideBoxDefaultOptions = null): PlotPpoDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotPpoDragDropGuideBoxOptions]
  }
}

