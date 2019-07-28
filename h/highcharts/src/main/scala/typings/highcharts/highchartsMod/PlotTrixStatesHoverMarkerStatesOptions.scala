package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTrixStatesHoverMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotTrixStatesHoverMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotTrixStatesHoverMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotTrixStatesHoverMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotTrixStatesHoverMarkerStatesSelectOptions] = js.undefined
}

object PlotTrixStatesHoverMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotTrixStatesHoverMarkerStatesHoverOptions = null,
    inactive: PlotTrixStatesHoverMarkerStatesInactiveOptions = null,
    normal: PlotTrixStatesHoverMarkerStatesNormalOptions = null,
    select: PlotTrixStatesHoverMarkerStatesSelectOptions = null
  ): PlotTrixStatesHoverMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotTrixStatesHoverMarkerStatesOptions]
  }
}

