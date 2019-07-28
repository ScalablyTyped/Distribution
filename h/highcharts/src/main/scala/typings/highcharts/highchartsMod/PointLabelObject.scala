package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointLabelObject extends js.Object {
  /**
    * The point's current color.
    */
  var color: ColorString | GradientColorObject | PatternObject
  /**
    * The point's current color index, used in styled mode instead of `color`.
    * The color index is inserted in class names used for styling.
    */
  var colorIndex: Double
  /**
    * The name of the related point.
    */
  var key: Double | String
  /**
    * The percentage for related points in a stacked series or pies.
    */
  var percentage: Double
  /**
    * The related point.
    */
  var point: Point
  /**
    * The related series.
    */
  var series: Series
  /**
    * The total of values in either a stack for stacked series, or a pie in a
    * pie series.
    */
  var total: Double
  /**
    * For categorized axes this property holds the category name for the point.
    * For other axes it holds the X value.
    */
  var x: Double | String
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PointLabelObject {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject,
    colorIndex: Double,
    key: Double | String,
    percentage: Double,
    point: Point,
    series: Series,
    total: Double,
    x: Double | String,
    y: Int | Double = null
  ): PointLabelObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorIndex = colorIndex, key = key.asInstanceOf[js.Any], percentage = percentage, point = point, series = series, total = total, x = x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLabelObject]
  }
}

