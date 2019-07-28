package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnAccessibilityKeyboardNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable/disable keyboard navigation support for a
    * specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotColumnAccessibilityKeyboardNavigationOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotColumnAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[PlotColumnAccessibilityKeyboardNavigationOptions]
  }
}

