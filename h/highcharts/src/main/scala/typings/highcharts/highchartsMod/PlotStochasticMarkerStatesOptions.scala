package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStochasticMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotStochasticMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotStochasticMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotStochasticMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotStochasticMarkerStatesSelectOptions] = js.undefined
}

object PlotStochasticMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotStochasticMarkerStatesHoverOptions = null,
    inactive: PlotStochasticMarkerStatesInactiveOptions = null,
    normal: PlotStochasticMarkerStatesNormalOptions = null,
    select: PlotStochasticMarkerStatesSelectOptions = null
  ): PlotStochasticMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotStochasticMarkerStatesOptions]
  }
}

