package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  A resource that represents a location with full geographic
  * information.
  */
@js.native
trait SchemaLocation extends StObject {
  
  /**
    * An object representing a latitude/longitude pair.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * The type of a location, which corresponds to the address lines field of
    * PostalAddress. For example, &quot;Downtown, Atlanta, GA, USA&quot; has a
    * type of LocationType#NEIGHBORHOOD, and &quot;Kansas City, KS, USA&quot;
    * has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.native
  
  /**
    * Postal address of the location that includes human readable information,
    * such as postal delivery and payments addresses. Given a postal address, a
    * postal service can deliver items to a premises, P.O. Box, or other
    * delivery location.
    */
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.native
  
  /**
    * Radius in miles of the job location. This value is derived from the
    * location bounding box in which a circle with the specified radius
    * centered from LatLng covers the area associated with the job location.
    * For example, currently, &quot;Mountain View, CA, USA&quot; has a radius
    * of 6.17 miles.
    */
  var radiusInMiles: js.UndefOr[Double] = js.native
}
object SchemaLocation {
  
  @scala.inline
  def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  @scala.inline
  implicit class SchemaLocationMutableBuilder[Self <: SchemaLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: SchemaPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    @scala.inline
    def setRadiusInMiles(value: Double): Self = StObject.set(x, "radiusInMiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusInMilesUndefined: Self = StObject.set(x, "radiusInMiles", js.undefined)
  }
}
