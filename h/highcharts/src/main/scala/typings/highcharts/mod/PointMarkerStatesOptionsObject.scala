package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointMarkerStatesOptionsObject extends js.Object {
  /**
    * The hover state for a single point marker.
    */
  var hover: PointStatesHoverOptionsObject
  var inactive: PointStatesInactiveOptionsObject
  /**
    * The normal state of a single point marker. Currently only used for
    * setting animation when returning to normal state from hover.
    */
  var normal: PointStatesNormalOptionsObject
  /**
    * The appearance of the point marker when selected. In order to allow a
    * point to be selected, set the `series.allowPointSelect` option to true.
    */
  var select: PointStatesSelectOptionsObject
}

object PointMarkerStatesOptionsObject {
  @scala.inline
  def apply(
    hover: PointStatesHoverOptionsObject,
    inactive: PointStatesInactiveOptionsObject,
    normal: PointStatesNormalOptionsObject,
    select: PointStatesSelectOptionsObject
  ): PointMarkerStatesOptionsObject = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointMarkerStatesOptionsObject]
  }
}

