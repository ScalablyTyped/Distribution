package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsElliottWaveShapeOptions extends js.Object {
  /**
    * (Highstock) Name of the dash style to use for the shape's stroke.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highstock) The color of the shape's fill.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The height of the shape.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The radius of the shape.
    */
  var r: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Defines additional snapping area around an annotation making
    * this annotation to focus. Defined in pixels.
    */
  var snap: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The URL for an image to use as the annotation shape. Note,
    * type has to be set to `'image'`.
    */
  var src: js.UndefOr[String] = js.native
  /**
    * (Highstock) The color of the shape's stroke.
    */
  var stroke: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock) The pixel stroke width of the shape.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The type of the shape, e.g. circle or rectangle.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * (Highstock) The width of the shape.
    */
  var width: js.UndefOr[Double] = js.native
}

object AnnotationsElliottWaveShapeOptions {
  @scala.inline
  def apply(): AnnotationsElliottWaveShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveShapeOptions]
  }
  @scala.inline
  implicit class AnnotationsElliottWaveShapeOptionsOps[Self <: AnnotationsElliottWaveShapeOptions] (val x: Self) extends AnyVal {
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
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setFill(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setSnap(value: Double): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStroke(value: ColorString): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

