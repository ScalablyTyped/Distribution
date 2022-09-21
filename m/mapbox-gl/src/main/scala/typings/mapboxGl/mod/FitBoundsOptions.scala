package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitBoundsOptions
  extends StObject
     with FlyToOptions {
  
  var linear: js.UndefOr[Boolean] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
}
object FitBoundsOptions {
  
  inline def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  extension [Self <: FitBoundsOptions](x: Self) {
    
    inline def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
  }
}
