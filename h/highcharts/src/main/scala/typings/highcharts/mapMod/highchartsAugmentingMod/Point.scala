package typings.highcharts.mapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var pointPadding: js.UndefOr[Double] = js.undefined
  /**
    * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
    * properies are copied over here.
    */
  var properties: js.Any
  var value: js.UndefOr[Double | Null] = js.undefined
  /**
    * Highmaps only. Zoom in on the point using the global animation.
    */
  def zoomTo(): Unit
}

object Point {
  @scala.inline
  def apply(
    properties: js.Any,
    zoomTo: () => Unit,
    pointPadding: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Null | Double] = js.undefined
  ): Point = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], zoomTo = js.Any.fromFunction0(zoomTo))
    if (!js.isUndefined(pointPadding)) __obj.updateDynamic("pointPadding")(pointPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

