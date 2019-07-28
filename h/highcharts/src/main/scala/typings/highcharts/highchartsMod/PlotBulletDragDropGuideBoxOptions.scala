package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBulletDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotBulletDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotBulletDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotBulletDragDropGuideBoxDefaultOptions = null): PlotBulletDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotBulletDragDropGuideBoxOptions]
  }
}

