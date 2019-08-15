package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisPlotBandsEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Click event on a plot band.
    */
  var click: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Mouse move event on a plot band.
    */
  var mousemove: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Mouse out event on the corner of a plot
    * band.
    */
  var mouseout: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Mouse over event on a plot band.
    */
  var mouseover: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
}

object NavigatorXAxisPlotBandsEventsOptions {
  @scala.inline
  def apply(
    click: EventCallbackFunction[PlotLineOrBand] = null,
    mousemove: EventCallbackFunction[PlotLineOrBand] = null,
    mouseout: EventCallbackFunction[PlotLineOrBand] = null,
    mouseover: EventCallbackFunction[PlotLineOrBand] = null
  ): NavigatorXAxisPlotBandsEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    __obj.asInstanceOf[NavigatorXAxisPlotBandsEventsOptions]
  }
}

