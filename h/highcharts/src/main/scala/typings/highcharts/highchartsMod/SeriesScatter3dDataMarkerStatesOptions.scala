package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesScatter3dDataMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[SeriesScatter3dDataMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[SeriesScatter3dDataMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[SeriesScatter3dDataMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[SeriesScatter3dDataMarkerStatesSelectOptions] = js.undefined
}

object SeriesScatter3dDataMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: SeriesScatter3dDataMarkerStatesHoverOptions = null,
    inactive: SeriesScatter3dDataMarkerStatesInactiveOptions = null,
    normal: SeriesScatter3dDataMarkerStatesNormalOptions = null,
    select: SeriesScatter3dDataMarkerStatesSelectOptions = null
  ): SeriesScatter3dDataMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[SeriesScatter3dDataMarkerStatesOptions]
  }
}

