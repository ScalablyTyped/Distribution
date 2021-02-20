package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsElliottWaveTypeOptions extends StObject {
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsElliottWaveTypeLineOptions] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsElliottWaveTypePointsOptions]] = js.native
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object AnnotationsElliottWaveTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsElliottWaveTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsElliottWaveTypeOptionsMutableBuilder[Self <: AnnotationsElliottWaveTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: AnnotationsElliottWaveTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsElliottWaveTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsElliottWaveTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value :_*))
    
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
