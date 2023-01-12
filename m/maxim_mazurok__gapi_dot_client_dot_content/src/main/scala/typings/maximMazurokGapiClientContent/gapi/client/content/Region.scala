package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /** The display name of the region. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** A list of geotargets that defines the region area. */
  var geotargetArea: js.UndefOr[RegionGeoTargetArea] = js.undefined
  
  /** Output only. Immutable. Merchant that owns the region. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** A list of postal codes that defines the region area. */
  var postalCodeArea: js.UndefOr[RegionPostalCodeArea] = js.undefined
  
  /** Output only. Immutable. The ID uniquely identifying each region. */
  var regionId: js.UndefOr[String] = js.undefined
  
  /** Output only. Indicates if the region is eligible to use in the Regional Inventory configuration. */
  var regionalInventoryEligible: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Indicates if the region is eligible to use in the Shipping Services configuration. */
  var shippingEligible: js.UndefOr[Boolean] = js.undefined
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGeotargetArea(value: RegionGeoTargetArea): Self = StObject.set(x, "geotargetArea", value.asInstanceOf[js.Any])
    
    inline def setGeotargetAreaUndefined: Self = StObject.set(x, "geotargetArea", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPostalCodeArea(value: RegionPostalCodeArea): Self = StObject.set(x, "postalCodeArea", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeAreaUndefined: Self = StObject.set(x, "postalCodeArea", js.undefined)
    
    inline def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    inline def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
    
    inline def setRegionalInventoryEligible(value: Boolean): Self = StObject.set(x, "regionalInventoryEligible", value.asInstanceOf[js.Any])
    
    inline def setRegionalInventoryEligibleUndefined: Self = StObject.set(x, "regionalInventoryEligible", js.undefined)
    
    inline def setShippingEligible(value: Boolean): Self = StObject.set(x, "shippingEligible", value.asInstanceOf[js.Any])
    
    inline def setShippingEligibleUndefined: Self = StObject.set(x, "shippingEligible", js.undefined)
  }
}
