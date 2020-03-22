package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardNavigationOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
    * drawn around elements while navigating through them.
    */
  var focusBorder: js.UndefOr[KeyboardNavigationFocusBorderOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
    * chart. Determines which elements are tabbed to first. Available elements
    * are: `series`, `zoom`, `rangeSelector`, `chartMenu`, `legend`. In
    * addition, any custom components can be added here.
    */
  var order: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
    * navigation of data points and series.
    */
  var seriesNavigation: js.UndefOr[KeyboardNavigationSeriesNavigationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
    * when reaching the end of arrow-key navigation for an element in the
    * chart.
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}

object KeyboardNavigationOptionsObject {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    focusBorder: KeyboardNavigationFocusBorderOptionsObject = null,
    order: js.Array[String] = null,
    seriesNavigation: KeyboardNavigationSeriesNavigationOptionsObject = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): KeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (focusBorder != null) __obj.updateDynamic("focusBorder")(focusBorder.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (seriesNavigation != null) __obj.updateDynamic("seriesNavigation")(seriesNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardNavigationOptionsObject]
  }
}

