package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCylinderDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotCylinderDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotCylinderDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotCylinderDragDropGuideBoxDefaultOptions = null): PlotCylinderDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotCylinderDragDropGuideBoxOptions]
  }
}

