package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsStatesSelectMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotKeltnerchannelsStatesSelectMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotKeltnerchannelsStatesSelectMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotKeltnerchannelsStatesSelectMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotKeltnerchannelsStatesSelectMarkerStatesSelectOptions] = js.undefined
}

object PlotKeltnerchannelsStatesSelectMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotKeltnerchannelsStatesSelectMarkerStatesHoverOptions = null,
    inactive: PlotKeltnerchannelsStatesSelectMarkerStatesInactiveOptions = null,
    normal: PlotKeltnerchannelsStatesSelectMarkerStatesNormalOptions = null,
    select: PlotKeltnerchannelsStatesSelectMarkerStatesSelectOptions = null
  ): PlotKeltnerchannelsStatesSelectMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotKeltnerchannelsStatesSelectMarkerStatesOptions]
  }
}

