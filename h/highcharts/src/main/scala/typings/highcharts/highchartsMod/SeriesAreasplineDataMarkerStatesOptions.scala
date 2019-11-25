package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesAreasplineDataMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[SeriesAreasplineDataMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[SeriesAreasplineDataMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[SeriesAreasplineDataMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[SeriesAreasplineDataMarkerStatesSelectOptions] = js.undefined
}

object SeriesAreasplineDataMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: SeriesAreasplineDataMarkerStatesHoverOptions = null,
    inactive: SeriesAreasplineDataMarkerStatesInactiveOptions = null,
    normal: SeriesAreasplineDataMarkerStatesNormalOptions = null,
    select: SeriesAreasplineDataMarkerStatesSelectOptions = null
  ): SeriesAreasplineDataMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesAreasplineDataMarkerStatesOptions]
  }
}

