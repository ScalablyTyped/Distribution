package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAoMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotAoMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotAoMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotAoMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotAoMarkerStatesSelectOptions] = js.undefined
}

object PlotAoMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotAoMarkerStatesHoverOptions = null,
    inactive: PlotAoMarkerStatesInactiveOptions = null,
    normal: PlotAoMarkerStatesNormalOptions = null,
    select: PlotAoMarkerStatesSelectOptions = null
  ): PlotAoMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotAoMarkerStatesOptions]
  }
}

