package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureTypeOptions extends StObject {
  
  var background: js.UndefOr[AnnotationsMeasureTypeBackgroundOptions] = js.undefined
  
  /**
    * (Highstock) Configure a crosshair that is horizontally placed in middle
    * of rectangle.
    */
  var crosshairX: js.UndefOr[AnnotationsMeasureTypeCrosshairXOptions] = js.undefined
  
  /**
    * (Highstock) Configure a crosshair that is vertically placed in middle of
    * rectangle.
    */
  var crosshairY: js.UndefOr[AnnotationsMeasureTypeCrosshairYOptions] = js.undefined
  
  var label: js.UndefOr[AnnotationsMeasureTypeLabelOptions] = js.undefined
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsMeasureTypeLineOptions] = js.undefined
  
  var points: js.UndefOr[js.Array[AnnotationsMeasureTypePointsOptions]] = js.undefined
  
  /**
    * (Highstock) Decides in what dimensions the user can resize by dragging
    * the mouse. Can be one of x, y or xy.
    */
  var selectType: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the yAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}
object AnnotationsMeasureTypeOptions {
  
  inline def apply(): AnnotationsMeasureTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeOptions]
  }
  
  extension [Self <: AnnotationsMeasureTypeOptions](x: Self) {
    
    inline def setBackground(value: AnnotationsMeasureTypeBackgroundOptions): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCrosshairX(value: AnnotationsMeasureTypeCrosshairXOptions): Self = StObject.set(x, "crosshairX", value.asInstanceOf[js.Any])
    
    inline def setCrosshairXUndefined: Self = StObject.set(x, "crosshairX", js.undefined)
    
    inline def setCrosshairY(value: AnnotationsMeasureTypeCrosshairYOptions): Self = StObject.set(x, "crosshairY", value.asInstanceOf[js.Any])
    
    inline def setCrosshairYUndefined: Self = StObject.set(x, "crosshairY", js.undefined)
    
    inline def setLabel(value: AnnotationsMeasureTypeLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: AnnotationsMeasureTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPoints(value: js.Array[AnnotationsMeasureTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: AnnotationsMeasureTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def setSelectType(value: String): Self = StObject.set(x, "selectType", value.asInstanceOf[js.Any])
    
    inline def setSelectTypeUndefined: Self = StObject.set(x, "selectType", js.undefined)
    
    inline def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
