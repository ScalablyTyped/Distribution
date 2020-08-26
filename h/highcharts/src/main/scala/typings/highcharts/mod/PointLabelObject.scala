package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointLabelObject extends js.Object {
  /**
    * The point's current color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * The point's current color index, used in styled mode instead of `color`.
    * The color index is inserted in class names used for styling.
    */
  var colorIndex: Double = js.native
  /**
    * The name of the related point.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The percentage for related points in a stacked series or pies.
    */
  var percentage: Double = js.native
  /**
    * The related point. The point name, if defined, is available through
    * `this.point.name`.
    */
  var point: Point = js.native
  /**
    * The related series. The series name is available through
    * `this.series.name`.
    */
  var series: Series = js.native
  /**
    * The total of values in either a stack for stacked series, or a pie in a
    * pie series.
    */
  var total: js.UndefOr[Double] = js.native
  /**
    * For categorized axes this property holds the category name for the point.
    * For other axes it holds the X value.
    */
  var x: js.UndefOr[Double | String] = js.native
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[Double] = js.native
}

object PointLabelObject {
  @scala.inline
  def apply(colorIndex: Double, percentage: Double, point: Point, series: Series): PointLabelObject = {
    val __obj = js.Dynamic.literal(colorIndex = colorIndex.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLabelObject]
  }
  @scala.inline
  implicit class PointLabelObjectOps[Self <: PointLabelObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeries(value: Series): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

