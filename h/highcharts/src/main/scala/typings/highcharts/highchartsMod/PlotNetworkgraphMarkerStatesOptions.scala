package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotNetworkgraphMarkerStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for a single point node.
    * Applied to all not connected nodes to the hovered one.
    */
  var inactive: js.UndefOr[PlotNetworkgraphMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotNetworkgraphMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) The appearance of the point marker when selected. In order
    * to allow a point to be selected, set the `series.allowPointSelect` option
    * to true.
    */
  var select: js.UndefOr[PlotNetworkgraphMarkerStatesSelectOptions] = js.undefined
}

object PlotNetworkgraphMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotNetworkgraphMarkerStatesHoverOptions = null,
    inactive: PlotNetworkgraphMarkerStatesInactiveOptions = null,
    normal: PlotNetworkgraphMarkerStatesNormalOptions = null,
    select: PlotNetworkgraphMarkerStatesSelectOptions = null
  ): PlotNetworkgraphMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotNetworkgraphMarkerStatesOptions]
  }
}

