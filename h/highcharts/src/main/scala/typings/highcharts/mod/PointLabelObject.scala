package typings.highcharts.mod

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
    * The related point. The point name, if defined, is available through
    * `this.point.name`.
    */
  var point: Point
  /**
    * The related series. The series name is available through
    * `this.series.name`.
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
    total: js.UndefOr[Double] = js.undefined,
    x: Double | String = null,
    y: js.UndefOr[Double] = js.undefined
  ): PointLabelObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLabelObject]
  }
}

