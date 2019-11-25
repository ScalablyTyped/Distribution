package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRsiMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotRsiMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotRsiMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotRsiMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotRsiMarkerStatesSelectOptions] = js.undefined
}

object PlotRsiMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotRsiMarkerStatesHoverOptions = null,
    inactive: PlotRsiMarkerStatesInactiveOptions = null,
    normal: PlotRsiMarkerStatesNormalOptions = null,
    select: PlotRsiMarkerStatesSelectOptions = null
  ): PlotRsiMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotRsiMarkerStatesOptions]
  }
}

