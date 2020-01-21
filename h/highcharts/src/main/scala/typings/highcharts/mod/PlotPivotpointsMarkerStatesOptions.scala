package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPivotpointsMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotPivotpointsMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotPivotpointsMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPivotpointsMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotPivotpointsMarkerStatesSelectOptions] = js.undefined
}

object PlotPivotpointsMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotPivotpointsMarkerStatesHoverOptions = null,
    inactive: PlotPivotpointsMarkerStatesInactiveOptions = null,
    normal: PlotPivotpointsMarkerStatesNormalOptions = null,
    select: PlotPivotpointsMarkerStatesSelectOptions = null
  ): PlotPivotpointsMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPivotpointsMarkerStatesOptions]
  }
}

