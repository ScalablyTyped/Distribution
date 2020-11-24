package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsMeasureTypeOptions extends js.Object {
  
  var background: js.UndefOr[AnnotationsMeasureTypeBackgroundOptions] = js.native
  
  /**
    * (Highstock) Configure a crosshair that is horizontally placed in middle
    * of rectangle.
    */
  var crosshairX: js.UndefOr[AnnotationsMeasureTypeCrosshairXOptions] = js.native
  
  /**
    * (Highstock) Configure a crosshair that is vertically placed in middle of
    * rectangle.
    */
  var crosshairY: js.UndefOr[AnnotationsMeasureTypeCrosshairYOptions] = js.native
  
  var label: js.UndefOr[AnnotationsMeasureTypeLabelOptions] = js.native
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsMeasureTypeLineOptions] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsMeasureTypePointsOptions]] = js.native
  
  /**
    * (Highstock) Decides in what dimensions the user can resize by dragging
    * the mouse. Can be one of x, y or xy.
    */
  var selectType: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the yAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object AnnotationsMeasureTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsMeasureTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureTypeOptionsOps[Self <: AnnotationsMeasureTypeOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: AnnotationsMeasureTypeBackgroundOptions): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCrosshairX(value: AnnotationsMeasureTypeCrosshairXOptions): Self = this.set("crosshairX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairX: Self = this.set("crosshairX", js.undefined)
    
    @scala.inline
    def setCrosshairY(value: AnnotationsMeasureTypeCrosshairYOptions): Self = this.set("crosshairY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairY: Self = this.set("crosshairY", js.undefined)
    
    @scala.inline
    def setLabel(value: AnnotationsMeasureTypeLabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLine(value: AnnotationsMeasureTypeLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsMeasureTypePointsOptions*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsMeasureTypePointsOptions]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setSelectType(value: String): Self = this.set("selectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectType: Self = this.set("selectType", js.undefined)
    
    @scala.inline
    def setXAxis(value: Double): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
}
