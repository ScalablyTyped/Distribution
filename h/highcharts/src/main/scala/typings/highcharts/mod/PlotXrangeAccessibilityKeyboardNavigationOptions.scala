package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotXrangeAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Enable/disable keyboard navigation support
    * for a specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotXrangeAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotXrangeAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotXrangeAccessibilityKeyboardNavigationOptions]
  }
}

