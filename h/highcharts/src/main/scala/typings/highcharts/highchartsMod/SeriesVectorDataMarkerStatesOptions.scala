package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesVectorDataMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[SeriesVectorDataMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[SeriesVectorDataMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[SeriesVectorDataMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[SeriesVectorDataMarkerStatesSelectOptions] = js.undefined
}

object SeriesVectorDataMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: SeriesVectorDataMarkerStatesHoverOptions = null,
    inactive: SeriesVectorDataMarkerStatesInactiveOptions = null,
    normal: SeriesVectorDataMarkerStatesNormalOptions = null,
    select: SeriesVectorDataMarkerStatesSelectOptions = null
  ): SeriesVectorDataMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVectorDataMarkerStatesOptions]
  }
}

