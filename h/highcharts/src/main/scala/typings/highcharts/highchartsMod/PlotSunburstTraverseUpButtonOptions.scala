package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstTraverseUpButtonOptions extends js.Object {
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotSunburstTraverseUpButtonPositionOptions] = js.undefined
}

object PlotSunburstTraverseUpButtonOptions {
  @scala.inline
  def apply(position: PlotSunburstTraverseUpButtonPositionOptions = null): PlotSunburstTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PlotSunburstTraverseUpButtonOptions]
  }
}

