package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsElliottWaveTypePointsOptions extends StObject {
  
  var controlPoint: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var label: js.UndefOr[AnnotationsElliottWaveTypePointsLabelOptions] = js.native
  
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.native
}
object AnnotationsElliottWaveTypePointsOptions {
  
  @scala.inline
  def apply(): AnnotationsElliottWaveTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypePointsOptions]
  }
  
  @scala.inline
  implicit class AnnotationsElliottWaveTypePointsOptionsMutableBuilder[Self <: AnnotationsElliottWaveTypePointsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPoint(value: Double): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointUndefined: Self = StObject.set(x, "controlPoint", js.undefined)
    
    @scala.inline
    def setLabel(value: AnnotationsElliottWaveTypePointsLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
