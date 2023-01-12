package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchAxis extends StObject {
  
  var client: js.UndefOr[Double] = js.undefined
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var location: js.UndefOr[Double] = js.undefined
  
  var startLocation: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
}
object TouchAxis {
  
  inline def apply(): TouchAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchAxis] (val x: Self) extends AnyVal {
    
    inline def setClient(value: Double): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStartLocation(value: Double): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    inline def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
