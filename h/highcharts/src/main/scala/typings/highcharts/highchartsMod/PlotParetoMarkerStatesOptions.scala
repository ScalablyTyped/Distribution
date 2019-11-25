package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParetoMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotParetoMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotParetoMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotParetoMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) The appearance of the point marker when selected. In order
    * to allow a point to be selected, set the `series.allowPointSelect` option
    * to true.
    */
  var select: js.UndefOr[PlotParetoMarkerStatesSelectOptions] = js.undefined
}

object PlotParetoMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotParetoMarkerStatesHoverOptions = null,
    inactive: PlotParetoMarkerStatesInactiveOptions = null,
    normal: PlotParetoMarkerStatesNormalOptions = null,
    select: PlotParetoMarkerStatesSelectOptions = null
  ): PlotParetoMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParetoMarkerStatesOptions]
  }
}

