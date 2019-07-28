package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBoxplotAccessibilityOptions extends js.Object {
  /**
    * (Highcharts) Provide a description of the series, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Enable/disable accessibility functionality for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Expose only the series element to screen readers, not its
    * points.
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Keyboard navigation for a series
    */
  var keyboardNavigation: js.UndefOr[js.Object | PlotBoxplotAccessibilityKeyboardNavigationOptions] = js.undefined
  /**
    * (Highcharts) Formatter function to use instead of the default for point
    * descriptions. Same as `accessibility.pointDescriptionFormatter`, but for
    * a single series.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
}

object PlotBoxplotAccessibilityOptions {
  @scala.inline
  def apply(
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined,
    keyboardNavigation: js.Object | PlotBoxplotAccessibilityKeyboardNavigationOptions = null,
    pointDescriptionFormatter: js.Function = null
  ): PlotBoxplotAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(exposeAsGroupOnly)) __obj.updateDynamic("exposeAsGroupOnly")(exposeAsGroupOnly)
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    __obj.asInstanceOf[PlotBoxplotAccessibilityOptions]
  }
}

