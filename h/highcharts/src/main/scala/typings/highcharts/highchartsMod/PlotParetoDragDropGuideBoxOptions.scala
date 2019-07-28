package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParetoDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotParetoDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotParetoDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotParetoDragDropGuideBoxDefaultOptions = null): PlotParetoDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotParetoDragDropGuideBoxOptions]
  }
}

