package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGaugeDialOptions extends js.Object {
  /**
    * (Highcharts) The background or fill color of the gauge's dial.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The length of the dial's base part, relative to the total
    * radius or length of the dial.
    */
  var baseLength: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The pixel width of the base of the gauge dial. The base is
    * the part closest to the pivot, defined by baseLength.
    */
  var baseWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The border color or stroke of the gauge's dial. By default,
    * the borderWidth is 0, so this must be set in addition to a custom border
    * color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The width of the gauge dial border in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The radius or length of the dial, in percentages relative to
    * the radius of the gauge itself.
    */
  var radius: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The length of the dial's rear end, the part that extends out
    * on the other side of the pivot. Relative to the dial's length.
    */
  var rearLength: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The width of the top of the dial, closest to the perimeter.
    * The pivot narrows in from the base to the top.
    */
  var topWidth: js.UndefOr[Double] = js.native
}

object PlotGaugeDialOptions {
  @scala.inline
  def apply(): PlotGaugeDialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGaugeDialOptions]
  }
  @scala.inline
  implicit class PlotGaugeDialOptionsOps[Self <: PlotGaugeDialOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBaseLength(value: String): Self = this.set("baseLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseLength: Self = this.set("baseLength", js.undefined)
    @scala.inline
    def setBaseWidth(value: Double): Self = this.set("baseWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseWidth: Self = this.set("baseWidth", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setRadius(value: String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRearLength(value: String): Self = this.set("rearLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRearLength: Self = this.set("rearLength", js.undefined)
    @scala.inline
    def setTopWidth(value: Double): Self = this.set("topWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopWidth: Self = this.set("topWidth", js.undefined)
  }
  
}

