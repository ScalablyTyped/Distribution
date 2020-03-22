package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the legend.
    */
  var enabled: js.UndefOr[js.Object] = js.undefined
}

object LegendAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.Object = null): LegendAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendAccessibilityKeyboardNavigationOptions]
  }
}

