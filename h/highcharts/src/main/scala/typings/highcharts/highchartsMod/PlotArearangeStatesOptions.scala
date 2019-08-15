package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArearangeStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Options for the hovered series. These settings
    * override the normal state options when a series is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotArearangeStatesHoverOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotArearangeStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a series, or for point items
    * in column, pie and similar series. Currently only used for setting
    * animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotArearangeStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Specific options for point in selected states,
    * after being selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotArearangeStatesSelectOptions] = js.undefined
}

object PlotArearangeStatesOptions {
  @scala.inline
  def apply(
    hover: PlotArearangeStatesHoverOptions = null,
    inactive: PlotArearangeStatesInactiveOptions = null,
    normal: PlotArearangeStatesNormalOptions = null,
    select: PlotArearangeStatesSelectOptions = null
  ): PlotArearangeStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotArearangeStatesOptions]
  }
}

