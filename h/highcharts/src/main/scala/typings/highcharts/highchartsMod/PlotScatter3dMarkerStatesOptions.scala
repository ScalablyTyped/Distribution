package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatter3dMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotScatter3dMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotScatter3dMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotScatter3dMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) The appearance of the point marker when selected. In order
    * to allow a point to be selected, set the `series.allowPointSelect` option
    * to true.
    */
  var select: js.UndefOr[PlotScatter3dMarkerStatesSelectOptions] = js.undefined
}

object PlotScatter3dMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotScatter3dMarkerStatesHoverOptions = null,
    inactive: PlotScatter3dMarkerStatesInactiveOptions = null,
    normal: PlotScatter3dMarkerStatesNormalOptions = null,
    select: PlotScatter3dMarkerStatesSelectOptions = null
  ): PlotScatter3dMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatter3dMarkerStatesOptions]
  }
}

