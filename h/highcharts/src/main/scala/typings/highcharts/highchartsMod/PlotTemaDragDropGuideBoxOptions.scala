package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTemaDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotTemaDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotTemaDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotTemaDragDropGuideBoxDefaultOptions = null): PlotTemaDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotTemaDragDropGuideBoxOptions]
  }
}

