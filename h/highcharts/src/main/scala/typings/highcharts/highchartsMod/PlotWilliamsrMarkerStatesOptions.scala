package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWilliamsrMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotWilliamsrMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotWilliamsrMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotWilliamsrMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotWilliamsrMarkerStatesSelectOptions] = js.undefined
}

object PlotWilliamsrMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotWilliamsrMarkerStatesHoverOptions = null,
    inactive: PlotWilliamsrMarkerStatesInactiveOptions = null,
    normal: PlotWilliamsrMarkerStatesNormalOptions = null,
    select: PlotWilliamsrMarkerStatesSelectOptions = null
  ): PlotWilliamsrMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotWilliamsrMarkerStatesOptions]
  }
}

