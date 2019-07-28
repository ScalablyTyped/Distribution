package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDemaDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotDemaDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotDemaDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotDemaDragDropGuideBoxDefaultOptions = null): PlotDemaDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotDemaDragDropGuideBoxOptions]
  }
}

