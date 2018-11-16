package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PointEvents extends js.Object {
  /**
           * Fires when a point is clicked. One parameter, event, is passed to the function. This contains common event
           * information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
           *
           * If the series.allowPointSelect option is true, the default action for the point's click event is to toggle the
           * point's select state. Returning false cancels this action.
           *
           * The this keyword refers to the Point object.
           */
  var click: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean]] = js.undefined
  /**
           * Fires when the legend item belonging to the pie point (slice) is clicked.
           * The this keyword refers to the point itself. One parameter, event, is passed to the function.
           * This contains common event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
           * The default action is to toggle the visibility of the point. This can be prevented by calling event.preventDefault().
           */
  var legendItemClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  /**
           * Fires when the mouse leaves the area close to the point. One parameter, event, is passed to the function. This
           * contains common event information based on jQuery or MooTools depending on which library is used as the base for
           * Highcharts.
           *
           * The this keyword refers to the Point object.
           */
  var mouseOut: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
           * Fires when the mouse enters the area close to the point. One parameter, event, is passed to the function. This
           * contains common event information based on jQuery or MooTools depending on which library is used as the base for
           * Highcharts.
           *
           * The this keyword refers to the Point object.
           */
  var mouseOver: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
           * Fires when the point is removed using the .remove() method. One parameter, event, is passed to the function.
           * Returning false cancels the operation.
           *
           * The this keyword refers to the Point object.
           * @since 1.2.0
           */
  var remove: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  /**
           * Fires when the point is selected either programmatically or following a click on the point. One parameter, event,
           * is passed to the function. Returning false cancels the operation.
           *
           * The this keyword refers to the Point object.
           * @since 1.2.0
           */
  var select: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  /**
           * Fires when the point is unselected either programmatically or following a click on the point. One parameter,
           * event, is passed to the function. Returning false cancels the operation.
           *
           * The this keyword refers to the Point object.
           * @since 1.2.0
           */
  var unselect: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  /**
           * Fires when the point is updated programmatically through the .update() method. One parameter, event, is passed to
           * the function. The new point options can be accessed through event.options. Returning false cancels the operation.
           *
           * The this keyword refers to the Point object.
           * @since 1.2.0
           */
  var update: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
}

