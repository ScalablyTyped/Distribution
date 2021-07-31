package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Geographical coordinates of a point, in WGS84.
  */
trait SchemaGeoPoint extends StObject {
  
  /**
    * Altitude above the reference ellipsoid, in meters.
    */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /**
    * Latitude in degrees.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * Longitude in degrees.
    */
  var longitude: js.UndefOr[Double] = js.undefined
}
object SchemaGeoPoint {
  
  @scala.inline
  def apply(): SchemaGeoPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoPoint]
  }
  
  @scala.inline
  implicit class SchemaGeoPointMutableBuilder[Self <: SchemaGeoPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
