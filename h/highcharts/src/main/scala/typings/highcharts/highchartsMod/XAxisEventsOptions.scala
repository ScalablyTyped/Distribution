package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisEventsOptions extends js.Object {
  /**
    * (Highcharts, Gantt) An event fired after the breaks have rendered.
    */
  var afterBreaks: js.UndefOr[AxisEventCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) As opposed to the `setExtremes`
    * event, this event fires after the final min and max values are computed
    * and corrected for `minRange`.
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
    * (Highcharts, Gantt) An event fired when a break from this axis occurs on
    * a point.
    */
  var pointBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
    * break from this axis.
    */
  var pointInBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the minimum and
    * maximum is set for the axis, either by calling the `.setExtremes()`
    * method or by selecting an area in the chart. One parameter, `event`, is
    * passed to the function, containing common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
}

object XAxisEventsOptions {
  @scala.inline
  def apply(
    afterBreaks: AxisEventCallbackFunction = null,
    afterSetExtremes: AxisSetExtremesEventCallbackFunction = null,
    pointBreak: AxisPointBreakEventCallbackFunction = null,
    pointInBreak: AxisPointBreakEventCallbackFunction = null,
    setExtremes: AxisSetExtremesEventCallbackFunction = null
  ): XAxisEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (afterBreaks != null) __obj.updateDynamic("afterBreaks")(afterBreaks)
    if (afterSetExtremes != null) __obj.updateDynamic("afterSetExtremes")(afterSetExtremes)
    if (pointBreak != null) __obj.updateDynamic("pointBreak")(pointBreak)
    if (pointInBreak != null) __obj.updateDynamic("pointInBreak")(pointInBreak)
    if (setExtremes != null) __obj.updateDynamic("setExtremes")(setExtremes)
    __obj.asInstanceOf[XAxisEventsOptions]
  }
}

