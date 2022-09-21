package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeoPoint extends StObject {
  
  /**
    * Altitude above the reference ellipsoid, in meters.
    */
  var altitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Latitude in degrees.
    */
  var latitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Longitude in degrees.
    */
  var longitude: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGeoPoint {
  
  inline def apply(): SchemaGeoPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoPoint]
  }
  
  extension [Self <: SchemaGeoPoint](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
