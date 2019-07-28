package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSupertrendStatesHoverMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotSupertrendStatesHoverMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotSupertrendStatesHoverMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotSupertrendStatesHoverMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotSupertrendStatesHoverMarkerStatesSelectOptions] = js.undefined
}

object PlotSupertrendStatesHoverMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotSupertrendStatesHoverMarkerStatesHoverOptions = null,
    inactive: PlotSupertrendStatesHoverMarkerStatesInactiveOptions = null,
    normal: PlotSupertrendStatesHoverMarkerStatesNormalOptions = null,
    select: PlotSupertrendStatesHoverMarkerStatesSelectOptions = null
  ): PlotSupertrendStatesHoverMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotSupertrendStatesHoverMarkerStatesOptions]
  }
}

