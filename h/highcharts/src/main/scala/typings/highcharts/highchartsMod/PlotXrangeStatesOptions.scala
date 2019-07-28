package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotXrangeStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotXrangeStatesHoverOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotXrangeStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The normal state of a series, or for point
    * items in column, pie and similar series. Currently only used for setting
    * animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotXrangeStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotXrangeStatesSelectOptions] = js.undefined
}

object PlotXrangeStatesOptions {
  @scala.inline
  def apply(
    hover: PlotXrangeStatesHoverOptions = null,
    inactive: PlotXrangeStatesInactiveOptions = null,
    normal: PlotXrangeStatesNormalOptions = null,
    select: PlotXrangeStatesSelectOptions = null
  ): PlotXrangeStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotXrangeStatesOptions]
  }
}

