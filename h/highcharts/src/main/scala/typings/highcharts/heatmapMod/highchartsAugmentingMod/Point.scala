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
  def apply(pointPadding: js.UndefOr[Double] = js.undefined, value: js.UndefOr[Null | Double] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pointPadding)) __obj.updateDynamic("pointPadding")(pointPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

