package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatter3dStatesHoverMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotScatter3dStatesHoverMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotScatter3dStatesHoverMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotScatter3dStatesHoverMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotScatter3dStatesHoverMarkerStatesSelectOptions] = js.undefined
}

object PlotScatter3dStatesHoverMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotScatter3dStatesHoverMarkerStatesHoverOptions = null,
    inactive: PlotScatter3dStatesHoverMarkerStatesInactiveOptions = null,
    normal: PlotScatter3dStatesHoverMarkerStatesNormalOptions = null,
    select: PlotScatter3dStatesHoverMarkerStatesSelectOptions = null
  ): PlotScatter3dStatesHoverMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotScatter3dStatesHoverMarkerStatesOptions]
  }
}

