package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the legend.
    */
  var enabled: js.UndefOr[js.Any] = js.undefined
}

object LegendAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.Any = null): LegendAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[LegendAccessibilityKeyboardNavigationOptions]
  }
}

