package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotKeltnerchannelsMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotKeltnerchannelsMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotKeltnerchannelsMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotKeltnerchannelsMarkerStatesSelectOptions] = js.undefined
}

object PlotKeltnerchannelsMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotKeltnerchannelsMarkerStatesHoverOptions = null,
    inactive: PlotKeltnerchannelsMarkerStatesInactiveOptions = null,
    normal: PlotKeltnerchannelsMarkerStatesNormalOptions = null,
    select: PlotKeltnerchannelsMarkerStatesSelectOptions = null
  ): PlotKeltnerchannelsMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotKeltnerchannelsMarkerStatesOptions]
  }
}

