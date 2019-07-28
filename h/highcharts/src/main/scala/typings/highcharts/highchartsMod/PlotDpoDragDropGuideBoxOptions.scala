package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDpoDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotDpoDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotDpoDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotDpoDragDropGuideBoxDefaultOptions = null): PlotDpoDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotDpoDragDropGuideBoxOptions]
  }
}

