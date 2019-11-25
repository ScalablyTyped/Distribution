package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotLinearregressionMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotLinearregressionMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotLinearregressionMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotLinearregressionMarkerStatesSelectOptions] = js.undefined
}

object PlotLinearregressionMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotLinearregressionMarkerStatesHoverOptions = null,
    inactive: PlotLinearregressionMarkerStatesInactiveOptions = null,
    normal: PlotLinearregressionMarkerStatesNormalOptions = null,
    select: PlotLinearregressionMarkerStatesSelectOptions = null
  ): PlotLinearregressionMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLinearregressionMarkerStatesOptions]
  }
}

