package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAreaBusiness extends StObject {
  
  /**
    * Required. Indicates the type of the service area business.
    */
  var businessType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The area that this business serves defined through a set of places.
    */
  var places: js.UndefOr[SchemaPlaces] = js.undefined
  
  /**
    * Immutable. CLDR region code of the country/region that this service area business is based in. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: "CH" for Switzerland. This field is required for CUSTOMER_LOCATION_ONLY businesses, and is ignored otherwise. The region specified here can be different from regions for the areas that this business serves (e.g. service area businesses that provide services in regions other than the one that they are based in). If this location requires verification after creation, the address provided for verification purposes *must* be located within this region, and the business owner or their authorized representative *must* be able to receive postal mail at the provided verification address.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAreaBusiness {
  
  inline def apply(): SchemaServiceAreaBusiness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAreaBusiness]
  }
  
  extension [Self <: SchemaServiceAreaBusiness](x: Self) {
    
    inline def setBusinessType(value: String): Self = StObject.set(x, "businessType", value.asInstanceOf[js.Any])
    
    inline def setBusinessTypeNull: Self = StObject.set(x, "businessType", null)
    
    inline def setBusinessTypeUndefined: Self = StObject.set(x, "businessType", js.undefined)
    
    inline def setPlaces(value: SchemaPlaces): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    inline def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
