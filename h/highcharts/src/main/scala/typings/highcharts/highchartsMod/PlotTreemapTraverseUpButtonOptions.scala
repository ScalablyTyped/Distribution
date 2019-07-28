package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapTraverseUpButtonOptions extends js.Object {
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotTreemapTraverseUpButtonPositionOptions] = js.undefined
}

object PlotTreemapTraverseUpButtonOptions {
  @scala.inline
  def apply(position: PlotTreemapTraverseUpButtonPositionOptions = null): PlotTreemapTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonOptions]
  }
}

