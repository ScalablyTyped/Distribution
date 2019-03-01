package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotEvents extends js.Object {
  /**
    * Fires after the series has finished its initial animation, or in case animation is disabled, immediately as the
    * series is displayed.
    *
    * The this keyword refers to the Series object.
    * @since 4.0
    */
  var afterAnimate: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when the checkbox next to the series' name in the legend is clicked. One parameter, event, is passed to the
    * function. The state of the checkbox is found by event.checked. The checked item is found by event.item. Return
    * false to prevent the default action which is to toggle the select state of the series.
    *
    * The this keyword refers to the Series object.
    * @since 1.2.0
    */
  var checkboxClick: js.UndefOr[js.Function1[/* event */ AreaCheckboxEvent, scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Fires when the series is clicked. One parameter, event, is passed to the function. This contains common event
    * information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
    * Additionally, event.point holds a pointer to the nearest point on the graph.
    *
    * The this keyword refers to the Series object.
    */
  var click: js.UndefOr[js.Function1[/* event */ AreaClickEvent, scala.Unit]] = js.undefined
  /**
    * Fires when the series is hidden after chart generation time, either by clicking the legend item or by calling
    * .hide().
    *
    * The this keyword refers to the Series object.
    */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Fires when the legend item belonging to the series is clicked. One parameter, event, is passed to the function.
    * This contains common event information based on jQuery or MooTools depending on which library is used as the base
    * for Highcharts. The default action is to toggle the visibility of the series. This can be prevented by returning
    * false or calling event.preventDefault().
    *
    * The this keyword refers to the Series object.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Fires when the mouse leaves the graph. One parameter, event, is passed to the function. This contains common
    * event information based on jQuery or MooTools depending on which library is used as the base for Highcharts. If
    * the stickyTracking option is true, mouseOut doesn't happen before the mouse enters another graph or leaves the
    * plot area.
    *
    * The this keyword refers to the Series object.
    */
  var mouseOut: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when the mouse enters the graph. One parameter, event, is passed to the function. This contains common
    * event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
    *
    * The this keyword refers to the Series object.
    */
  var mouseOver: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    * Fires when the series is shown after chart generation time, either by clicking the legend item or by calling
    * .show().
    *
    * The this keyword refers to the Series object.
    * @since 1.2.0
    */
  var show: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object PlotEvents {
  @scala.inline
  def apply(
    afterAnimate: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    checkboxClick: js.Function1[/* event */ AreaCheckboxEvent, scala.Boolean | scala.Unit] = null,
    click: js.Function1[/* event */ AreaClickEvent, scala.Unit] = null,
    hide: js.Function0[scala.Unit] = null,
    legendItemClick: js.Function1[/* event */ stdLib.Event, scala.Boolean | scala.Unit] = null,
    mouseOut: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    mouseOver: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    show: js.Function0[scala.Unit] = null
  ): PlotEvents = {
    val __obj = js.Dynamic.literal()
    if (afterAnimate != null) __obj.updateDynamic("afterAnimate")(afterAnimate)
    if (checkboxClick != null) __obj.updateDynamic("checkboxClick")(checkboxClick)
    if (click != null) __obj.updateDynamic("click")(click)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick)
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(mouseOut)
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[PlotEvents]
  }
}

