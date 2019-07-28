package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVennDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotVennDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotVennDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotVennDragDropGuideBoxDefaultOptions = null): PlotVennDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotVennDragDropGuideBoxOptions]
  }
}

