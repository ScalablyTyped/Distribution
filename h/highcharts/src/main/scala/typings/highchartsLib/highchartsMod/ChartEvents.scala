package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartEvents extends js.Object {
  /**
    * Fires when a series is added to the chart after load time, using the addSeries method. One parameter, event, is
    * passed to the function. This contains common event information based on jQuery or MooTools depending on which
    * library is used as the base for Highcharts. Through event.options you can access the series options that was
    * passed to the addSeries method. Returning false prevents the series from being added.
    *
    * The this keyword refers to the Chart object.
    * @since 1.2.0
    */
  var addSeries: js.UndefOr[js.Function1[/* event */ AddSeriesEvent, scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Fires after a chart is printed through the context menu item or the Chart.print method. Requires the exporting
    * module.
    * @since 4.1.0
    */
  var afterPrint: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires before a chart is printed through the context menu item or the Chart.print method. Requires the exporting
    * module.
    * @since 4.1.0
    */
  var beforePrint: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when clicking on the plot background. One parameter, event, is passed to the function. This contains common
    * event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
    *
    * Information on the clicked spot can be found through event.xAxis and event.yAxis, which are arrays containing the
    * axes of each dimension and each axis' value at the clicked spot. The primary axes are event.xAxis[0] and
    * event.yAxis[0]. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.
    *
    * click: function(e) {
    *      console.log(Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value), e.yAxis[0].value);
    * }
    *
    * The this keyword refers to the Chart object.
    * @since 1.2.0
    */
  var click: js.UndefOr[js.Function1[/* event */ ChartClickEvent, scala.Unit]] = js.undefined
  /**
    * Fires when a drilldown point is clicked, before the new series is added.
    * @since 3.0.8
    */
  var drilldown: js.UndefOr[js.Function1[/* event */ ChartDrilldownEvent, scala.Unit]] = js.undefined
  /**
    * Fires when drilling up from a drilldown series.
    * @since 3.0.8
    */
  var drillup: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires after drilling up from all drilldown series.
    * @since 4.2.4
    */
  var drillupall: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when the chart is finished loading. One parameter, event, is passed to the function. This contains common
    * event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
    *
    * From version 2.0.4, there is also a second parameter to Highcharts.Chart where a callback function can be passed
    * to be executed on chart.load.
    *
    * The this keyword refers to the Chart object.
    */
  var load: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when the chart is redrawn, either after a call to chart.redraw() or after an axis, series or point is
    * modified with the redraw option set to true. One parameter, event, is passed to the function. This contains
    * common event information based on jQuery or MooTools depending on which library is used as the base for
    * Highcharts.
    *
    * The this keyword refers to the Chart object.
    * @since 1.2.0
    */
  var redraw: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires after initial load of the chart (directly after the load
    * event), and after each redraw (directly after the redraw event).
    *
    * @since 5.0.7
    */
  var render: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when an area of the chart has been selected. Selection is enabled by setting the chart's zoomType. One
    * parameter, event, is passed to the function. This contains common event information based on jQuery or MooTools
    * depending on which library is used as the base for Highcharts. The default action for the selection event is to
    * zoom the chart to the selected area. It can be prevented by calling event.preventDefault().
    *
    * Information on the selected area can be found through event.xAxis and event.yAxis, which are arrays containing
    * the axes of each dimension and each axis' min and max values. The primary axes are event.xAxis[0] and
    * event.yAxis[0]. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.
    *
    * selection: function(event) {
    *      // log the min and max of the primary, datetime x-axis
    *      console.log(
    *          Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),
    *          Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max)
    *      );
    *      // log the min and max of the y axis
    *      console.log(event.yAxis[0].min, event.yAxis[0].max);
    * }
    */
  var selection: js.UndefOr[js.Function1[/* event */ ChartSelectionEvent, scala.Unit]] = js.undefined
}

object ChartEvents {
  @scala.inline
  def apply(
    addSeries: /* event */ AddSeriesEvent => scala.Boolean | scala.Unit = null,
    afterPrint: /* event */ stdLib.Event => scala.Unit = null,
    beforePrint: /* event */ stdLib.Event => scala.Unit = null,
    click: /* event */ ChartClickEvent => scala.Unit = null,
    drilldown: /* event */ ChartDrilldownEvent => scala.Unit = null,
    drillup: /* event */ stdLib.Event => scala.Unit = null,
    drillupall: /* event */ stdLib.Event => scala.Unit = null,
    load: /* event */ stdLib.Event => scala.Unit = null,
    redraw: /* event */ stdLib.Event => scala.Unit = null,
    render: /* event */ stdLib.Event => scala.Unit = null,
    selection: /* event */ ChartSelectionEvent => scala.Unit = null
  ): ChartEvents = {
    val __obj = js.Dynamic.literal()
    if (addSeries != null) __obj.updateDynamic("addSeries")(js.Any.fromFunction1(addSeries))
    if (afterPrint != null) __obj.updateDynamic("afterPrint")(js.Any.fromFunction1(afterPrint))
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(js.Any.fromFunction1(beforePrint))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (drilldown != null) __obj.updateDynamic("drilldown")(js.Any.fromFunction1(drilldown))
    if (drillup != null) __obj.updateDynamic("drillup")(js.Any.fromFunction1(drillup))
    if (drillupall != null) __obj.updateDynamic("drillupall")(js.Any.fromFunction1(drillupall))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction1(redraw))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (selection != null) __obj.updateDynamic("selection")(js.Any.fromFunction1(selection))
    __obj.asInstanceOf[ChartEvents]
  }
}

