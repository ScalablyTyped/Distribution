package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCandlestickStatesOptions extends js.Object {
  /**
    * (Highstock) Options for the hovered point. These settings override the
    * normal state options when a point is moused over or touched.
    */
  var hover: js.UndefOr[PlotCandlestickStatesHoverOptions] = js.undefined
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotCandlestickStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotCandlestickStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotCandlestickStatesSelectOptions] = js.undefined
}

object PlotCandlestickStatesOptions {
  @scala.inline
  def apply(
    hover: PlotCandlestickStatesHoverOptions = null,
    inactive: PlotCandlestickStatesInactiveOptions = null,
    normal: PlotCandlestickStatesNormalOptions = null,
    select: PlotCandlestickStatesSelectOptions = null
  ): PlotCandlestickStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCandlestickStatesOptions]
  }
}

