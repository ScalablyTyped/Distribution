package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVariwideDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotVariwideDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotVariwideDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotVariwideDragDropGuideBoxDefaultOptions = null): PlotVariwideDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVariwideDragDropGuideBoxOptions]
  }
}

