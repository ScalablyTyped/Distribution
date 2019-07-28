package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSplineStatesSelectMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotSplineStatesSelectMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotSplineStatesSelectMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotSplineStatesSelectMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotSplineStatesSelectMarkerStatesSelectOptions] = js.undefined
}

object PlotSplineStatesSelectMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotSplineStatesSelectMarkerStatesHoverOptions = null,
    inactive: PlotSplineStatesSelectMarkerStatesInactiveOptions = null,
    normal: PlotSplineStatesSelectMarkerStatesNormalOptions = null,
    select: PlotSplineStatesSelectMarkerStatesSelectOptions = null
  ): PlotSplineStatesSelectMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotSplineStatesSelectMarkerStatesOptions]
  }
}

