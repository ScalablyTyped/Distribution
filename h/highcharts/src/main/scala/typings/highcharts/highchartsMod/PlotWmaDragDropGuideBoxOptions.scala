package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWmaDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotWmaDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotWmaDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotWmaDragDropGuideBoxDefaultOptions = null): PlotWmaDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotWmaDragDropGuideBoxOptions]
  }
}

