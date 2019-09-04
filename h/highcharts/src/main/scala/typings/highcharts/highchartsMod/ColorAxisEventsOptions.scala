package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAxisEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) As opposed to the `setExtremes` event,
    * this event fires after the final min and max values are computed and
    * corrected for `minRange`.
    *
    * Fires when the minimum and maximum is set for the axis, either by calling
    * the `.setExtremes()` method or by selecting an area in the chart. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in axis
    * values. The actual data extremes are found in `event.dataMin` and
    * `event.dataMax`.
    */
  var afterSetExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
    * the colorAxis is clicked. One parameter, `event`, is passed to the
    * function.
    */
  var legendItemClick: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
    * set for the axis, either by calling the `.setExtremes()` method or by
    * selecting an area in the chart. One parameter, `event`, is passed to the
    * function, containing common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
}

object ColorAxisEventsOptions {
  @scala.inline
  def apply(
    afterSetExtremes: AxisSetExtremesEventCallbackFunction = null,
    legendItemClick: js.Function = null,
    setExtremes: AxisSetExtremesEventCallbackFunction = null
  ): ColorAxisEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (afterSetExtremes != null) __obj.updateDynamic("afterSetExtremes")(afterSetExtremes)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick)
    if (setExtremes != null) __obj.updateDynamic("setExtremes")(setExtremes)
    __obj.asInstanceOf[ColorAxisEventsOptions]
  }
}

