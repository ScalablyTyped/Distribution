package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMfiStatesSelectMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotMfiStatesSelectMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotMfiStatesSelectMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotMfiStatesSelectMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotMfiStatesSelectMarkerStatesSelectOptions] = js.undefined
}

object PlotMfiStatesSelectMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotMfiStatesSelectMarkerStatesHoverOptions = null,
    inactive: PlotMfiStatesSelectMarkerStatesInactiveOptions = null,
    normal: PlotMfiStatesSelectMarkerStatesNormalOptions = null,
    select: PlotMfiStatesSelectMarkerStatesSelectOptions = null
  ): PlotMfiStatesSelectMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotMfiStatesSelectMarkerStatesOptions]
  }
}

