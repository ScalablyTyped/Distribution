package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the legend.
    */
  var enabled: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
    * for the legend.
    */
  var keyboardNavigation: js.UndefOr[LegendAccessibilityKeyboardNavigationOptions] = js.undefined
}

object LegendAccessibilityOptions {
  @scala.inline
  def apply(enabled: js.Any = null, keyboardNavigation: LegendAccessibilityKeyboardNavigationOptions = null): LegendAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendAccessibilityOptions]
  }
}

