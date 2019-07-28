package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressioninterceptMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotLinearregressioninterceptMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotLinearregressioninterceptMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotLinearregressioninterceptMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotLinearregressioninterceptMarkerStatesSelectOptions] = js.undefined
}

object PlotLinearregressioninterceptMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotLinearregressioninterceptMarkerStatesHoverOptions = null,
    inactive: PlotLinearregressioninterceptMarkerStatesInactiveOptions = null,
    normal: PlotLinearregressioninterceptMarkerStatesNormalOptions = null,
    select: PlotLinearregressioninterceptMarkerStatesSelectOptions = null
  ): PlotLinearregressioninterceptMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotLinearregressioninterceptMarkerStatesOptions]
  }
}

