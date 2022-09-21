package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2FulfillmentInfo extends StObject {
  
  /**
    * The IDs for this type, such as the store IDs for FulfillmentInfo.type.pickup-in-store or the region IDs for FulfillmentInfo.type.same-day-delivery. A maximum of 3000 values are allowed. Each value must be a string with a length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var placeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The fulfillment type, including commonly used types (such as pickup in store and same day delivery), and custom types. Customers have to map custom types to their display names before rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2FulfillmentInfo {
  
  inline def apply(): SchemaGoogleCloudRetailV2FulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2FulfillmentInfo]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2FulfillmentInfo](x: Self) {
    
    inline def setPlaceIds(value: js.Array[String]): Self = StObject.set(x, "placeIds", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdsNull: Self = StObject.set(x, "placeIds", null)
    
    inline def setPlaceIdsUndefined: Self = StObject.set(x, "placeIds", js.undefined)
    
    inline def setPlaceIdsVarargs(value: String*): Self = StObject.set(x, "placeIds", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
