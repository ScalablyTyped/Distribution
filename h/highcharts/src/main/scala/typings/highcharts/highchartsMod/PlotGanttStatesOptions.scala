package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotGanttStatesHoverOptions] = js.undefined
  /**
    * (Gantt) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotGanttStatesInactiveOptions] = js.undefined
  /**
    * (Gantt) The normal state of a series, or for point items in column, pie
    * and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotGanttStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotGanttStatesSelectOptions] = js.undefined
}

object PlotGanttStatesOptions {
  @scala.inline
  def apply(
    hover: PlotGanttStatesHoverOptions = null,
    inactive: PlotGanttStatesInactiveOptions = null,
    normal: PlotGanttStatesNormalOptions = null,
    select: PlotGanttStatesSelectOptions = null
  ): PlotGanttStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGanttStatesOptions]
  }
}

