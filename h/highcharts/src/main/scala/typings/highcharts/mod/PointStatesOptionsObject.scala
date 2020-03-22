package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PointStatesHoverOptionsObject] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for a single point node.
    * Applied to all not connected nodes to the hovered one.
    */
  var inactive: js.UndefOr[PointStatesInactiveOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PointStatesNormalOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PointStatesSelectOptionsObject] = js.undefined
}

object PointStatesOptionsObject {
  @scala.inline
  def apply(
    hover: PointStatesHoverOptionsObject = null,
    inactive: PointStatesInactiveOptionsObject = null,
    normal: PointStatesNormalOptionsObject = null,
    select: PointStatesSelectOptionsObject = null
  ): PointStatesOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStatesOptionsObject]
  }
}

