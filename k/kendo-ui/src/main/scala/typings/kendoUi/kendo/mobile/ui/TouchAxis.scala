package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchAxis extends StObject {
  
  var client: js.UndefOr[Double] = js.native
  
  var delta: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Double] = js.native
  
  var startLocation: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
}
object TouchAxis {
  
  @scala.inline
  def apply(): TouchAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchAxis]
  }
  
  @scala.inline
  implicit class TouchAxisMutableBuilder[Self <: TouchAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Double): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStartLocation(value: Double): Self = StObject.set(x, "startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLocationUndefined: Self = StObject.set(x, "startLocation", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
