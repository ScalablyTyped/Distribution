package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleStatesOptions extends js.Object {
  /**
    * (Highmaps) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotMapbubbleStatesHoverOptions] = js.undefined
  /**
    * (Highmaps) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotMapbubbleStatesInactiveOptions] = js.undefined
  /**
    * (Highmaps) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotMapbubbleStatesNormalOptions] = js.undefined
  /**
    * (Highmaps) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotMapbubbleStatesSelectOptions] = js.undefined
}

object PlotMapbubbleStatesOptions {
  @scala.inline
  def apply(
    hover: PlotMapbubbleStatesHoverOptions = null,
    inactive: PlotMapbubbleStatesInactiveOptions = null,
    normal: PlotMapbubbleStatesNormalOptions = null,
    select: PlotMapbubbleStatesSelectOptions = null
  ): PlotMapbubbleStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleStatesOptions]
  }
}

