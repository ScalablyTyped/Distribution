package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramidStatesOptions extends js.Object {
  /**
    * (Highcharts) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotPyramidStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotPyramidStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPyramidStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) Options for a selected funnel item.
    */
  var select: js.UndefOr[PlotPyramidStatesSelectOptions] = js.undefined
}

object PlotPyramidStatesOptions {
  @scala.inline
  def apply(
    hover: PlotPyramidStatesHoverOptions = null,
    inactive: PlotPyramidStatesInactiveOptions = null,
    normal: PlotPyramidStatesNormalOptions = null,
    select: PlotPyramidStatesSelectOptions = null
  ): PlotPyramidStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotPyramidStatesOptions]
  }
}

