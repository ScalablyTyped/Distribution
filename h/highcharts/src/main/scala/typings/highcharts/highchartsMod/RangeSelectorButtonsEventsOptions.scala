package typings.highcharts.highchartsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonsEventsOptions extends js.Object {
  /**
    * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
    * parameter, event, is passed to the function, containing common event
    * information.
    *
    *  (see online documentation for example)
    *
    * Return false to stop default button's click action.
    */
  var click: js.UndefOr[RangeSelectorClickCallbackFunction] = js.undefined
}

object RangeSelectorButtonsEventsOptions {
  @scala.inline
  def apply(click: (/* e */ Event, /* Return */ js.UndefOr[Boolean]) => Unit = null): RangeSelectorButtonsEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2(click))
    __obj.asInstanceOf[RangeSelectorButtonsEventsOptions]
  }
}

