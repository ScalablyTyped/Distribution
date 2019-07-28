package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBubbleStatesHoverMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotBubbleStatesHoverMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotBubbleStatesHoverMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PlotBubbleStatesHoverMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PlotBubbleStatesHoverMarkerStatesSelectOptions] = js.undefined
}

object PlotBubbleStatesHoverMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotBubbleStatesHoverMarkerStatesHoverOptions = null,
    inactive: PlotBubbleStatesHoverMarkerStatesInactiveOptions = null,
    normal: PlotBubbleStatesHoverMarkerStatesNormalOptions = null,
    select: PlotBubbleStatesHoverMarkerStatesSelectOptions = null
  ): PlotBubbleStatesHoverMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotBubbleStatesHoverMarkerStatesOptions]
  }
}

