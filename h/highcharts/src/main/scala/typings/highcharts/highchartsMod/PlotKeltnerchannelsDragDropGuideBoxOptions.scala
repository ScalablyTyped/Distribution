package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotKeltnerchannelsDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotKeltnerchannelsDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotKeltnerchannelsDragDropGuideBoxDefaultOptions = null): PlotKeltnerchannelsDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotKeltnerchannelsDragDropGuideBoxOptions]
  }
}

