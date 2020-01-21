package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOrganizationStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotOrganizationStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for a single point node/link.
    */
  var inactive: js.UndefOr[PlotOrganizationStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotOrganizationStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotOrganizationStatesSelectOptions] = js.undefined
}

object PlotOrganizationStatesOptions {
  @scala.inline
  def apply(
    hover: PlotOrganizationStatesHoverOptions = null,
    inactive: PlotOrganizationStatesInactiveOptions = null,
    normal: PlotOrganizationStatesNormalOptions = null,
    select: PlotOrganizationStatesSelectOptions = null
  ): PlotOrganizationStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOrganizationStatesOptions]
  }
}

