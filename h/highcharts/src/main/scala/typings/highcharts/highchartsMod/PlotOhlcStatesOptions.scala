package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOhlcStatesOptions extends js.Object {
  /**
    * (Highstock) Options for the hovered point. These settings override the
    * normal state options when a point is moused over or touched.
    */
  var hover: js.UndefOr[PlotOhlcStatesHoverOptions] = js.undefined
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotOhlcStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotOhlcStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotOhlcStatesSelectOptions] = js.undefined
}

object PlotOhlcStatesOptions {
  @scala.inline
  def apply(
    hover: PlotOhlcStatesHoverOptions = null,
    inactive: PlotOhlcStatesInactiveOptions = null,
    normal: PlotOhlcStatesNormalOptions = null,
    select: PlotOhlcStatesSelectOptions = null
  ): PlotOhlcStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOhlcStatesOptions]
  }
}

