package typings.maplibreGl.mod

import typings.std.PositionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocateOptions extends StObject {
  
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  
  var positionOptions: js.UndefOr[PositionOptions] = js.undefined
  
  var showAccuracyCircle: js.UndefOr[Boolean] = js.undefined
  
  var showUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var trackUserLocation: js.UndefOr[Boolean] = js.undefined
}
object GeolocateOptions {
  
  inline def apply(): GeolocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocateOptions] (val x: Self) extends AnyVal {
    
    inline def setFitBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
    
    inline def setPositionOptions(value: PositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
    
    inline def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
    
    inline def setShowAccuracyCircle(value: Boolean): Self = StObject.set(x, "showAccuracyCircle", value.asInstanceOf[js.Any])
    
    inline def setShowAccuracyCircleUndefined: Self = StObject.set(x, "showAccuracyCircle", js.undefined)
    
    inline def setShowUserLocation(value: Boolean): Self = StObject.set(x, "showUserLocation", value.asInstanceOf[js.Any])
    
    inline def setShowUserLocationUndefined: Self = StObject.set(x, "showUserLocation", js.undefined)
    
    inline def setTrackUserLocation(value: Boolean): Self = StObject.set(x, "trackUserLocation", value.asInstanceOf[js.Any])
    
    inline def setTrackUserLocationUndefined: Self = StObject.set(x, "trackUserLocation", js.undefined)
  }
}
