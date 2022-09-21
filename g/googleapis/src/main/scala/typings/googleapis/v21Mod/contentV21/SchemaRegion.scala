package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegion extends StObject {
  
  /**
    * The display name of the region.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of geotargets that defines the region area.
    */
  var geotargetArea: js.UndefOr[SchemaRegionGeoTargetArea] = js.undefined
  
  /**
    * Output only. Immutable. Merchant that owns the region.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of postal codes that defines the region area.
    */
  var postalCodeArea: js.UndefOr[SchemaRegionPostalCodeArea] = js.undefined
  
  /**
    * Output only. Immutable. The ID uniquely identifying each region.
    */
  var regionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates if the region is eligible to use in the Regional Inventory configuration.
    */
  var regionalInventoryEligible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the region is eligible to use in the Shipping Services configuration.
    */
  var shippingEligible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRegion {
  
  inline def apply(): SchemaRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegion]
  }
  
  extension [Self <: SchemaRegion](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGeotargetArea(value: SchemaRegionGeoTargetArea): Self = StObject.set(x, "geotargetArea", value.asInstanceOf[js.Any])
    
    inline def setGeotargetAreaUndefined: Self = StObject.set(x, "geotargetArea", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPostalCodeArea(value: SchemaRegionPostalCodeArea): Self = StObject.set(x, "postalCodeArea", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeAreaUndefined: Self = StObject.set(x, "postalCodeArea", js.undefined)
    
    inline def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    inline def setRegionIdNull: Self = StObject.set(x, "regionId", null)
    
    inline def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
    
    inline def setRegionalInventoryEligible(value: Boolean): Self = StObject.set(x, "regionalInventoryEligible", value.asInstanceOf[js.Any])
    
    inline def setRegionalInventoryEligibleNull: Self = StObject.set(x, "regionalInventoryEligible", null)
    
    inline def setRegionalInventoryEligibleUndefined: Self = StObject.set(x, "regionalInventoryEligible", js.undefined)
    
    inline def setShippingEligible(value: Boolean): Self = StObject.set(x, "shippingEligible", value.asInstanceOf[js.Any])
    
    inline def setShippingEligibleNull: Self = StObject.set(x, "shippingEligible", null)
    
    inline def setShippingEligibleUndefined: Self = StObject.set(x, "shippingEligible", js.undefined)
  }
}
