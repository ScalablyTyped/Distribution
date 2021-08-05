package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationResult extends StObject {
  
  var elevation: Double
  
  var location: LatLng
  
  var resolution: Double
}
object ElevationResult {
  
  inline def apply(elevation: Double, location: LatLng, resolution: Double): ElevationResult = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationResult]
  }
  
  extension [Self <: ElevationResult](x: Self) {
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
