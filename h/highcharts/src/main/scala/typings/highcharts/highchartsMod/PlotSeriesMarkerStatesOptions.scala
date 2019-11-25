package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSeriesMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The hover state for a single
    * point marker.
    */
  var hover: js.UndefOr[PlotSeriesMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotSeriesMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The normal state of a single
    * point marker. Currently only used for setting animation when returning to
    * normal state from hover.
    */
  var normal: js.UndefOr[PlotSeriesMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The appearance of the point
    * marker when selected. In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotSeriesMarkerStatesSelectOptions] = js.undefined
}

object PlotSeriesMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotSeriesMarkerStatesHoverOptions = null,
    inactive: PlotSeriesMarkerStatesInactiveOptions = null,
    normal: PlotSeriesMarkerStatesNormalOptions = null,
    select: PlotSeriesMarkerStatesSelectOptions = null
  ): PlotSeriesMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSeriesMarkerStatesOptions]
  }
}

