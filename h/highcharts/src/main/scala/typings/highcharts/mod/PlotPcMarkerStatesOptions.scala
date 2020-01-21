package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotPcMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotPcMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPcMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotPcMarkerStatesSelectOptions] = js.undefined
}

object PlotPcMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotPcMarkerStatesHoverOptions = null,
    inactive: PlotPcMarkerStatesInactiveOptions = null,
    normal: PlotPcMarkerStatesNormalOptions = null,
    select: PlotPcMarkerStatesSelectOptions = null
  ): PlotPcMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPcMarkerStatesOptions]
  }
}

