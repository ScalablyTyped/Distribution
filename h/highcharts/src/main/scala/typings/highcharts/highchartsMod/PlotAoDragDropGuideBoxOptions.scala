package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAoDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotAoDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotAoDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotAoDragDropGuideBoxDefaultOptions = null): PlotAoDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotAoDragDropGuideBoxOptions]
  }
}

