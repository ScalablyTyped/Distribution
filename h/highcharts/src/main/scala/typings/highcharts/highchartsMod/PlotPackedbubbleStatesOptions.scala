package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleStatesOptions extends js.Object {
  /**
    * (Highcharts) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotPackedbubbleStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotPackedbubbleStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPackedbubbleStatesNormalOptions] = js.undefined
  /**
    * (Highmaps) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotPackedbubbleStatesSelectOptions] = js.undefined
}

object PlotPackedbubbleStatesOptions {
  @scala.inline
  def apply(
    hover: PlotPackedbubbleStatesHoverOptions = null,
    inactive: PlotPackedbubbleStatesInactiveOptions = null,
    normal: PlotPackedbubbleStatesNormalOptions = null,
    select: PlotPackedbubbleStatesSelectOptions = null
  ): PlotPackedbubbleStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PlotPackedbubbleStatesOptions]
  }
}

