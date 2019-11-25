package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesStatesOptions extends js.Object {
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotPriceenvelopesStatesHoverOptions] = js.undefined
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotPriceenvelopesStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPriceenvelopesStatesNormalOptions] = js.undefined
  /**
    * (Highstock) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotPriceenvelopesStatesSelectOptions] = js.undefined
}

object PlotPriceenvelopesStatesOptions {
  @scala.inline
  def apply(
    hover: PlotPriceenvelopesStatesHoverOptions = null,
    inactive: PlotPriceenvelopesStatesInactiveOptions = null,
    normal: PlotPriceenvelopesStatesNormalOptions = null,
    select: PlotPriceenvelopesStatesSelectOptions = null
  ): PlotPriceenvelopesStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPriceenvelopesStatesOptions]
  }
}

