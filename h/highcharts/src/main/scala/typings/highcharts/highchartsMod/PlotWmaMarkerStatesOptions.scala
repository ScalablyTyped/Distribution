package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWmaMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotWmaMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotWmaMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotWmaMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotWmaMarkerStatesSelectOptions] = js.undefined
}

object PlotWmaMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotWmaMarkerStatesHoverOptions = null,
    inactive: PlotWmaMarkerStatesInactiveOptions = null,
    normal: PlotWmaMarkerStatesNormalOptions = null,
    select: PlotWmaMarkerStatesSelectOptions = null
  ): PlotWmaMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotWmaMarkerStatesOptions]
  }
}

