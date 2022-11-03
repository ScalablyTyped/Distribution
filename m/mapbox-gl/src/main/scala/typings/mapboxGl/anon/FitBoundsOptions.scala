package typings.mapboxGl.anon

import typings.mapboxGl.mod.PositionOptions
import typings.std.Geolocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitBoundsOptions extends StObject {
  
  var fitBoundsOptions: js.UndefOr[typings.mapboxGl.mod.FitBoundsOptions] = js.undefined
  
  var geolocation: js.UndefOr[Geolocation] = js.undefined
  
  var positionOptions: js.UndefOr[PositionOptions] = js.undefined
  
  var showAccuracyCircle: js.UndefOr[Boolean] = js.undefined
  
  var showUserHeading: js.UndefOr[Boolean] = js.undefined
  
  var showUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var trackUserLocation: js.UndefOr[Boolean] = js.undefined
}
object FitBoundsOptions {
  
  inline def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  extension [Self <: FitBoundsOptions](x: Self) {
    
    inline def setFitBoundsOptions(value: typings.mapboxGl.mod.FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
    
    inline def setGeolocation(value: Geolocation): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    inline def setGeolocationUndefined: Self = StObject.set(x, "geolocation", js.undefined)
    
    inline def setPositionOptions(value: PositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
    
    inline def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
    
    inline def setShowAccuracyCircle(value: Boolean): Self = StObject.set(x, "showAccuracyCircle", value.asInstanceOf[js.Any])
    
    inline def setShowAccuracyCircleUndefined: Self = StObject.set(x, "showAccuracyCircle", js.undefined)
    
    inline def setShowUserHeading(value: Boolean): Self = StObject.set(x, "showUserHeading", value.asInstanceOf[js.Any])
    
    inline def setShowUserHeadingUndefined: Self = StObject.set(x, "showUserHeading", js.undefined)
    
    inline def setShowUserLocation(value: Boolean): Self = StObject.set(x, "showUserLocation", value.asInstanceOf[js.Any])
    
    inline def setShowUserLocationUndefined: Self = StObject.set(x, "showUserLocation", js.undefined)
    
    inline def setTrackUserLocation(value: Boolean): Self = StObject.set(x, "trackUserLocation", value.asInstanceOf[js.Any])
    
    inline def setTrackUserLocationUndefined: Self = StObject.set(x, "trackUserLocation", js.undefined)
  }
}
