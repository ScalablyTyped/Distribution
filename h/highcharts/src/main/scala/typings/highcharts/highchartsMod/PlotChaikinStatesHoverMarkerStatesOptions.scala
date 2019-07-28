package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinStatesHoverMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotChaikinStatesHoverMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotChaikinStatesHoverMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotChaikinStatesHoverMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotChaikinStatesHoverMarkerStatesSelectOptions] = js.undefined
}

object PlotChaikinStatesHoverMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotChaikinStatesHoverMarkerStatesHoverOptions = null,
    inactive: PlotChaikinStatesHoverMarkerStatesInactiveOptions = null,
    normal: PlotChaikinStatesHoverMarkerStatesNormalOptions = null,
    select: PlotChaikinStatesHoverMarkerStatesSelectOptions = null
  ): PlotChaikinStatesHoverMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotChaikinStatesHoverMarkerStatesOptions]
  }
}

