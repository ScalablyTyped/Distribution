package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  A resource that represents a location with full geographic
  * information.
  */
trait SchemaJobLocation extends StObject {
  
  /**
    * An object representing a latitude/longitude pair.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * The type of a location, which corresponds to the address lines field of
    * PostalAddress. For example, &quot;Downtown, Atlanta, GA, USA&quot; has a
    * type of LocationType#NEIGHBORHOOD, and &quot;Kansas City, KS, USA&quot;
    * has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.undefined
  
  /**
    * Postal address of the location that includes human readable information,
    * such as postal delivery and payments addresses. Given a postal address, a
    * postal service can deliver items to a premises, P.O. Box, or other
    * delivery location.
    */
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  /**
    * Radius in meters of the job location. This value is derived from the
    * location bounding box in which a circle with the specified radius
    * centered from LatLng coves the area associated with the job location. For
    * example, currently, &quot;Mountain View, CA, USA&quot; has a radius of
    * 7885.79 meters.
    */
  var radiusMeters: js.UndefOr[Double] = js.undefined
}
object SchemaJobLocation {
  
  inline def apply(): SchemaJobLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobLocation]
  }
  
  extension [Self <: SchemaJobLocation](x: Self) {
    
    inline def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setPostalAddress(value: SchemaPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    inline def setRadiusMeters(value: Double): Self = StObject.set(x, "radiusMeters", value.asInstanceOf[js.Any])
    
    inline def setRadiusMetersUndefined: Self = StObject.set(x, "radiusMeters", js.undefined)
  }
}
