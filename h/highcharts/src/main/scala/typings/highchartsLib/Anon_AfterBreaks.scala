package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterBreaks extends js.Object {
  /**
    * An event fired after the breaks have rendered.
    * @since 4.1.0
    */
  var afterBreaks: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * As opposed to the setExtremes event, this event fires after the final min and max values are computed and
    * corrected for minRange.
    * The this keyword refers to the {@link AxisObject|Axis} object.
    * @since 2.3
    */
  var afterSetExtremes: js.UndefOr[
    js.Function1[/* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent, scala.Unit]
  ] = js.undefined
  /**
    * An event fired when a break from this axis occurs on a point.
    * The this keyword refers to the {@link AxisObject|Axis} object.
    */
  var pointBreak: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when the minimum and maximum is set for the axis, either by calling the .setExtremes() method or by
    * selecting an area in the chart. One parameter, event, is passed to the function. This contains common event
    * information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
    *
    * The new user set minimum and maximum values can be found by event.min and event.max. When an axis is zoomed
    * all the way out from the 'Reset zoom' button, event.min and event.max are null, and the new extremes are set
    * based on this.dataMin and this.dataMax.
    *
    * The this keyword refers to the {@link AxisObject|Axis} object.
    * @since 1.2.0
    */
  var setExtremes: js.UndefOr[
    js.Function1[/* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent, scala.Unit]
  ] = js.undefined
}

object Anon_AfterBreaks {
  @scala.inline
  def apply(
    afterBreaks: /* event */ stdLib.Event => scala.Unit = null,
    afterSetExtremes: /* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent => scala.Unit = null,
    pointBreak: /* event */ stdLib.Event => scala.Unit = null,
    setExtremes: /* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent => scala.Unit = null
  ): Anon_AfterBreaks = {
    val __obj = js.Dynamic.literal()
    if (afterBreaks != null) __obj.updateDynamic("afterBreaks")(js.Any.fromFunction1(afterBreaks))
    if (afterSetExtremes != null) __obj.updateDynamic("afterSetExtremes")(js.Any.fromFunction1(afterSetExtremes))
    if (pointBreak != null) __obj.updateDynamic("pointBreak")(js.Any.fromFunction1(pointBreak))
    if (setExtremes != null) __obj.updateDynamic("setExtremes")(js.Any.fromFunction1(setExtremes))
    __obj.asInstanceOf[Anon_AfterBreaks]
  }
}

