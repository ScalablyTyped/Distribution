package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNatrDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotNatrDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotNatrDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotNatrDragDropGuideBoxDefaultOptions = null): PlotNatrDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotNatrDragDropGuideBoxOptions]
  }
}

