package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRocMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotRocMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotRocMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotRocMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotRocMarkerStatesSelectOptions] = js.undefined
}

object PlotRocMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotRocMarkerStatesHoverOptions = null,
    inactive: PlotRocMarkerStatesInactiveOptions = null,
    normal: PlotRocMarkerStatesNormalOptions = null,
    select: PlotRocMarkerStatesSelectOptions = null
  ): PlotRocMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotRocMarkerStatesOptions]
  }
}

