package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAccessibilityOptionsObject extends js.Object {
  /**
    * (Highstock) Provide a description of the series, announced to screen
    * readers.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Enable/disable accessibility functionality for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Expose only the series element to screen readers, not its
    * points.
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Keyboard navigation for a series
    */
  var keyboardNavigation: js.UndefOr[SeriesAccessibilityKeyboardNavigationOptionsObject] = js.undefined
  /**
    * (Highstock) Formatter function to use instead of the default for point
    * descriptions. Same as `accessibility.point.descriptionFormatter`, but for
    * a single series.
    */
  var pointDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
}

object SeriesAccessibilityOptionsObject {
  @scala.inline
  def apply(
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined,
    keyboardNavigation: SeriesAccessibilityKeyboardNavigationOptionsObject = null,
    pointDescriptionFormatter: Point => String = null
  ): SeriesAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exposeAsGroupOnly)) __obj.updateDynamic("exposeAsGroupOnly")(exposeAsGroupOnly.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(js.Any.fromFunction1(pointDescriptionFormatter))
    __obj.asInstanceOf[SeriesAccessibilityOptionsObject]
  }
}

