package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPsarMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotPsarMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotPsarMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPsarMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotPsarMarkerStatesSelectOptions] = js.undefined
}

object PlotPsarMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotPsarMarkerStatesHoverOptions = null,
    inactive: PlotPsarMarkerStatesInactiveOptions = null,
    normal: PlotPsarMarkerStatesNormalOptions = null,
    select: PlotPsarMarkerStatesSelectOptions = null
  ): PlotPsarMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPsarMarkerStatesOptions]
  }
}

