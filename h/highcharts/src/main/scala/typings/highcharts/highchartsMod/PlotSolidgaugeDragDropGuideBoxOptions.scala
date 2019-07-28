package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSolidgaugeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotSolidgaugeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotSolidgaugeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotSolidgaugeDragDropGuideBoxDefaultOptions = null): PlotSolidgaugeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotSolidgaugeDragDropGuideBoxOptions]
  }
}

