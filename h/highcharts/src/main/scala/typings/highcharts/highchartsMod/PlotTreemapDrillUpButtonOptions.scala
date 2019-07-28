package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapDrillUpButtonOptions extends js.Object {
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotTreemapDrillUpButtonPositionOptions] = js.undefined
}

object PlotTreemapDrillUpButtonOptions {
  @scala.inline
  def apply(position: PlotTreemapDrillUpButtonPositionOptions = null): PlotTreemapDrillUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PlotTreemapDrillUpButtonOptions]
  }
}

