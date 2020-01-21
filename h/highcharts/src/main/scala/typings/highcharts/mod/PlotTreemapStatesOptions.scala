package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapStatesOptions extends js.Object {
  /**
    * (Highcharts) Options for the hovered series
    */
  var hover: js.UndefOr[PlotTreemapStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotTreemapStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotTreemapStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotTreemapStatesSelectOptions] = js.undefined
}

object PlotTreemapStatesOptions {
  @scala.inline
  def apply(
    hover: PlotTreemapStatesHoverOptions = null,
    inactive: PlotTreemapStatesInactiveOptions = null,
    normal: PlotTreemapStatesNormalOptions = null,
    select: PlotTreemapStatesSelectOptions = null
  ): PlotTreemapStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTreemapStatesOptions]
  }
}

