package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudTalentV4Location extends StObject {
  
  /**
    * An object representing a latitude/longitude pair.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * The type of a location, which corresponds to the address lines field of google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType.NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
    */
  var locationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
    */
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  /**
    * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from google.type.LatLng covers the area associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
    */
  var radiusMiles: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudTalentV4Location {
  
  inline def apply(): SchemaGoogleCloudTalentV4Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudTalentV4Location]
  }
  
  extension [Self <: SchemaGoogleCloudTalentV4Location](x: Self) {
    
    inline def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeNull: Self = StObject.set(x, "locationType", null)
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setPostalAddress(value: SchemaPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    inline def setRadiusMiles(value: Double): Self = StObject.set(x, "radiusMiles", value.asInstanceOf[js.Any])
    
    inline def setRadiusMilesNull: Self = StObject.set(x, "radiusMiles", null)
    
    inline def setRadiusMilesUndefined: Self = StObject.set(x, "radiusMiles", js.undefined)
  }
}
