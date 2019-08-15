package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesOptionsObject extends js.Object {
  /**
    * The hover state for a single point marker.
    */
  var hover: js.UndefOr[PointStatesHoverOptionsObject] = js.undefined
  /**
    * The hover state for a single point marker.
    */
  var inactive: js.UndefOr[PointStatesInactiveOptionsObject] = js.undefined
  /**
    * The hover state for a single point marker.
    */
  var normal: js.UndefOr[PointStatesNormalOptionsObject] = js.undefined
  /**
    * The hover state for a single point marker.
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
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[PointStatesOptionsObject]
  }
}

