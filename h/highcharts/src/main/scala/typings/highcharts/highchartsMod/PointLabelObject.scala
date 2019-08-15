package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointLabelObject extends js.Object {
  /**
    * The point's current color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * The point's current color index, used in styled mode instead of `color`.
    * The color index is inserted in class names used for styling.
    */
  var colorIndex: Double
  /**
    * The name of the related point.
    */
  var key: js.UndefOr[String] = js.undefined
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
  var total: js.UndefOr[Double] = js.undefined
  /**
    * For categorized axes this property holds the category name for the point.
    * For other axes it holds the X value.
    */
  var x: js.UndefOr[Double | String] = js.undefined
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PointLabelObject {
  @scala.inline
  def apply(
    colorIndex: Double,
    percentage: Double,
    point: Point,
    series: Series,
    color: ColorString | GradientColorObject | PatternObject = null,
    key: String = null,
    total: Int | Double = null,
    x: Double | String = null,
    y: Int | Double = null
  ): PointLabelObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex, percentage = percentage, point = point, series = series)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLabelObject]
  }
}

