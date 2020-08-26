package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeBackgroundOptions extends js.Object {
  /**
    * (Highstock) The color of the rectangle.
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * (Highstock) The color of border.
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * (Highstock) The width of border.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object AnnotationsMeasureTypeBackgroundOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeBackgroundOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeBackgroundOptionsOps[Self <: AnnotationsMeasureTypeBackgroundOptions] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

