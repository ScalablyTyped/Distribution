package typings.heremaps.H.map.SpatialStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used to initialize a style. If a property is not set, the default value from H.map.SpatialStyle is taken.
  * @property strokeColor {string=} - The color of the stroke in CSS syntax.
  * @property fillColor {string=} - The color of the stroke in CSS syntax.
  * @property lineWidth {number=} - The width of the line in pixels, default is 2. The maximum supported line width is 100.
  * @property lineCap {H.map.SpatialStyle.LineCap=} - The style of the end caps for a line.
  * @property lineJoin {H.map.SpatialStyle.LineJoin=} - The type of corner created, when two lines meet.
  * @property miterLimit {number=} - The miter limit in pixel, default is 10. The maximum supported miter limit is 100
  * @property lineDash {Array<number>} - The line dash pattern as an even numbered list of distances to alternately produce a line and a space. If the browser doesn't support this feature
  * this style property is ignored.
  * @property lineDashOffset {number=} - The phase offset of the line dash pattern
  */
@js.native
trait Options extends js.Object {
  
  var fillColor: js.UndefOr[String] = js.native
  
  var lineCap: js.UndefOr[LineCap] = js.native
  
  var lineDash: js.UndefOr[js.Array[Double]] = js.native
  
  var lineDashOffset: js.UndefOr[Double] = js.native
  
  var lineJoin: js.UndefOr[LineJoin] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var miterLimit: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setLineCap(value: LineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDash: Self = this.set("lineDash", js.undefined)
    
    @scala.inline
    def setLineDashOffset(value: Double): Self = this.set("lineDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashOffset: Self = this.set("lineDashOffset", js.undefined)
    
    @scala.inline
    def setLineJoin(value: LineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
  }
}
