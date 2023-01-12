package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragPanOptions extends StObject {
  
  var deceleration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  
  var linearity: js.UndefOr[Double] = js.undefined
  
  var maxSpeed: js.UndefOr[Double] = js.undefined
}
object DragPanOptions {
  
  inline def apply(): DragPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragPanOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragPanOptions] (val x: Self) extends AnyVal {
    
    inline def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    inline def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
    
    inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setLinearity(value: Double): Self = StObject.set(x, "linearity", value.asInstanceOf[js.Any])
    
    inline def setLinearityUndefined: Self = StObject.set(x, "linearity", js.undefined)
    
    inline def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeedUndefined: Self = StObject.set(x, "maxSpeed", js.undefined)
  }
}
