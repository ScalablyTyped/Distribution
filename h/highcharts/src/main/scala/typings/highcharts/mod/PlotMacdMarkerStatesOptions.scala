package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotMacdMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotMacdMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotMacdMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotMacdMarkerStatesSelectOptions] = js.undefined
}

object PlotMacdMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotMacdMarkerStatesHoverOptions = null,
    inactive: PlotMacdMarkerStatesInactiveOptions = null,
    normal: PlotMacdMarkerStatesNormalOptions = null,
    select: PlotMacdMarkerStatesSelectOptions = null
  ): PlotMacdMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMacdMarkerStatesOptions]
  }
}

