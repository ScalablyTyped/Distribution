package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSmaDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotSmaDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSmaDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSmaDragDropGuideBoxDefaultOptions = null): PlotSmaDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSmaDragDropGuideBoxOptions]
  }
}

