package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArearangeStatesSelectMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotArearangeStatesSelectMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotArearangeStatesSelectMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotArearangeStatesSelectMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotArearangeStatesSelectMarkerStatesSelectOptions] = js.undefined
}

object PlotArearangeStatesSelectMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotArearangeStatesSelectMarkerStatesHoverOptions = null,
    inactive: PlotArearangeStatesSelectMarkerStatesInactiveOptions = null,
    normal: PlotArearangeStatesSelectMarkerStatesNormalOptions = null,
    select: PlotArearangeStatesSelectMarkerStatesSelectOptions = null
  ): PlotArearangeStatesSelectMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotArearangeStatesSelectMarkerStatesOptions]
  }
}

