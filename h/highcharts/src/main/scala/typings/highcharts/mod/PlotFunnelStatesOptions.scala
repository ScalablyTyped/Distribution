package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFunnelStatesOptions extends js.Object {
  /**
    * (Highcharts) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotFunnelStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotFunnelStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotFunnelStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) Options for a selected funnel item.
    */
  var select: js.UndefOr[PlotFunnelStatesSelectOptions] = js.undefined
}

object PlotFunnelStatesOptions {
  @scala.inline
  def apply(
    hover: PlotFunnelStatesHoverOptions = null,
    inactive: PlotFunnelStatesInactiveOptions = null,
    normal: PlotFunnelStatesNormalOptions = null,
    select: PlotFunnelStatesSelectOptions = null
  ): PlotFunnelStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotFunnelStatesOptions]
  }
}

