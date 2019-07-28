package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMomentumStatesHoverMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotMomentumStatesHoverMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotMomentumStatesHoverMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotMomentumStatesHoverMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotMomentumStatesHoverMarkerStatesSelectOptions] = js.undefined
}

object PlotMomentumStatesHoverMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotMomentumStatesHoverMarkerStatesHoverOptions = null,
    inactive: PlotMomentumStatesHoverMarkerStatesInactiveOptions = null,
    normal: PlotMomentumStatesHoverMarkerStatesNormalOptions = null,
    select: PlotMomentumStatesHoverMarkerStatesSelectOptions = null
  ): PlotMomentumStatesHoverMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotMomentumStatesHoverMarkerStatesOptions]
  }
}

