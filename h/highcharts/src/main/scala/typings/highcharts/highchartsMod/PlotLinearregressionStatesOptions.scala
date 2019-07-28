package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionStatesOptions extends js.Object {
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotLinearregressionStatesHoverOptions] = js.undefined
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotLinearregressionStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotLinearregressionStatesNormalOptions] = js.undefined
  /**
    * (Highmaps) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotLinearregressionStatesSelectOptions] = js.undefined
}

object PlotLinearregressionStatesOptions {
  @scala.inline
  def apply(
    hover: PlotLinearregressionStatesHoverOptions = null,
    inactive: PlotLinearregressionStatesInactiveOptions = null,
    normal: PlotLinearregressionStatesNormalOptions = null,
    select: PlotLinearregressionStatesSelectOptions = null
  ): PlotLinearregressionStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotLinearregressionStatesOptions]
  }
}

