package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSplineMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotSplineMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotSplineMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotSplineMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotSplineMarkerStatesSelectOptions] = js.undefined
}

object PlotSplineMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotSplineMarkerStatesHoverOptions = null,
    inactive: PlotSplineMarkerStatesInactiveOptions = null,
    normal: PlotSplineMarkerStatesNormalOptions = null,
    select: PlotSplineMarkerStatesSelectOptions = null
  ): PlotSplineMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSplineMarkerStatesOptions]
  }
}

