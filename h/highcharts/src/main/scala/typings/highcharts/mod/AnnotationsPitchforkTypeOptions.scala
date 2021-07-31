package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsPitchforkTypeOptions extends StObject {
  
  /**
    * (Highstock) Inner background options.
    */
  var innerBackground: js.UndefOr[AnnotationsPitchforkTypeInnerBackgroundOptions] = js.undefined
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsPitchforkTypeLineOptions] = js.undefined
  
  /**
    * (Highstock) Outer background options.
    */
  var outerBackground: js.UndefOr[AnnotationsPitchforkTypeOuterBackgroundOptions] = js.undefined
  
  var points: js.UndefOr[js.Array[AnnotationsPitchforkTypePointsOptions]] = js.undefined
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}
object AnnotationsPitchforkTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsPitchforkTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsPitchforkTypeOptionsMutableBuilder[Self <: AnnotationsPitchforkTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerBackground(value: AnnotationsPitchforkTypeInnerBackgroundOptions): Self = StObject.set(x, "innerBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBackgroundUndefined: Self = StObject.set(x, "innerBackground", js.undefined)
    
    @scala.inline
    def setLine(value: AnnotationsPitchforkTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOuterBackground(value: AnnotationsPitchforkTypeOuterBackgroundOptions): Self = StObject.set(x, "outerBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterBackgroundUndefined: Self = StObject.set(x, "outerBackground", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsPitchforkTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsPitchforkTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
