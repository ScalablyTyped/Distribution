package typings.highcharts.heatmapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * Heatmap series only. Padding between the points in the heatmap.
    */
  var pointPadding: js.UndefOr[Double] = js.undefined
  /**
    * Heatmap series only. The value of the point, resulting in a color
    * controled by options as set in the colorAxis configuration.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}

object Point {
  @scala.inline
  def apply(pointPadding: Int | Double = null, value: Int | Double = null): Point = {
    val __obj = js.Dynamic.literal()
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

