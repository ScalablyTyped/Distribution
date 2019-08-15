package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTrendlineMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotTrendlineMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotTrendlineMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotTrendlineMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotTrendlineMarkerStatesSelectOptions] = js.undefined
}

object PlotTrendlineMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotTrendlineMarkerStatesHoverOptions = null,
    inactive: PlotTrendlineMarkerStatesInactiveOptions = null,
    normal: PlotTrendlineMarkerStatesNormalOptions = null,
    select: PlotTrendlineMarkerStatesSelectOptions = null
  ): PlotTrendlineMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotTrendlineMarkerStatesOptions]
  }
}

