package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCylinderStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotCylinderStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotCylinderStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotCylinderStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotCylinderStatesSelectOptions] = js.undefined
}

object PlotCylinderStatesOptions {
  @scala.inline
  def apply(
    hover: PlotCylinderStatesHoverOptions = null,
    inactive: PlotCylinderStatesInactiveOptions = null,
    normal: PlotCylinderStatesNormalOptions = null,
    select: PlotCylinderStatesSelectOptions = null
  ): PlotCylinderStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotCylinderStatesOptions]
  }
}

