package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAccessibilityKeyboardNavigationOptionsObject extends js.Object {
  /**
    * (Highstock) Enable/disable keyboard navigation support for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesAccessibilityKeyboardNavigationOptionsObject {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesAccessibilityKeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesAccessibilityKeyboardNavigationOptionsObject]
  }
}

