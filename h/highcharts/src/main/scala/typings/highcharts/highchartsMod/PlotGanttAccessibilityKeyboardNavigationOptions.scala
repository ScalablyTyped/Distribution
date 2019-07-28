package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Gantt) Enable/disable keyboard navigation support for a specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotGanttAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotGanttAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[PlotGanttAccessibilityKeyboardNavigationOptions]
  }
}

