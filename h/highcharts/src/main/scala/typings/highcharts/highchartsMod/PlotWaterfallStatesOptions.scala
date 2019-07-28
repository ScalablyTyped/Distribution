package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWaterfallStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotWaterfallStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotWaterfallStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotWaterfallStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotWaterfallStatesSelectOptions] = js.undefined
}

object PlotWaterfallStatesOptions {
  @scala.inline
  def apply(
    hover: PlotWaterfallStatesHoverOptions = null,
    inactive: PlotWaterfallStatesInactiveOptions = null,
    normal: PlotWaterfallStatesNormalOptions = null,
    select: PlotWaterfallStatesSelectOptions = null
  ): PlotWaterfallStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotWaterfallStatesOptions]
  }
}

