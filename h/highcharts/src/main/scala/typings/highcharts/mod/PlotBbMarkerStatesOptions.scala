package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBbMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotBbMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotBbMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotBbMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotBbMarkerStatesSelectOptions] = js.undefined
}

object PlotBbMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotBbMarkerStatesHoverOptions = null,
    inactive: PlotBbMarkerStatesInactiveOptions = null,
    normal: PlotBbMarkerStatesNormalOptions = null,
    select: PlotBbMarkerStatesSelectOptions = null
  ): PlotBbMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBbMarkerStatesOptions]
  }
}

