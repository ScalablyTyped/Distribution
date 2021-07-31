package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectangleFillGradient extends StObject {
  
  var center: js.UndefOr[js.Any] = js.undefined
  
  var end: js.UndefOr[js.Any] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[js.Any] = js.undefined
  
  var stops: js.UndefOr[js.Array[RectangleFillGradientStop]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object RectangleFillGradient {
  
  @scala.inline
  def apply(): RectangleFillGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleFillGradient]
  }
  
  @scala.inline
  implicit class RectangleFillGradientMutableBuilder[Self <: RectangleFillGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: js.Any): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[RectangleFillGradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: RectangleFillGradientStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
