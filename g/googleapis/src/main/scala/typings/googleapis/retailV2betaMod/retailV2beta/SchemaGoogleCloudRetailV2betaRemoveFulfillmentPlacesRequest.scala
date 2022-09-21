package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRemoveFulfillmentPlacesRequest extends StObject {
  
  /**
    * If set to true, and the Product is not found, the fulfillment information will still be processed and retained for at most 1 day and processed once the Product is created. If set to false, a NOT_FOUND error is returned if the Product is not found.
    */
  var allowMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The IDs for this type, such as the store IDs for "pickup-in-store" or the region IDs for "same-day-delivery", to be removed for this type. At least 1 value is required, and a maximum of 2000 values are allowed. Each value must be a string with a length limit of 10 characters, matching the pattern `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var placeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The time when the fulfillment updates are issued, used to prevent out-of-order updates on fulfillment information. If not provided, the internal system time will be used.
    */
  var removeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The fulfillment type, including commonly used types (such as pickup in store and same day delivery), and custom types. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned. This field directly corresponds to Product.fulfillment_info.type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRemoveFulfillmentPlacesRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRemoveFulfillmentPlacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRemoveFulfillmentPlacesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRemoveFulfillmentPlacesRequest](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingNull: Self = StObject.set(x, "allowMissing", null)
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setPlaceIds(value: js.Array[String]): Self = StObject.set(x, "placeIds", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdsNull: Self = StObject.set(x, "placeIds", null)
    
    inline def setPlaceIdsUndefined: Self = StObject.set(x, "placeIds", js.undefined)
    
    inline def setPlaceIdsVarargs(value: String*): Self = StObject.set(x, "placeIds", js.Array(value*))
    
    inline def setRemoveTime(value: String): Self = StObject.set(x, "removeTime", value.asInstanceOf[js.Any])
    
    inline def setRemoveTimeNull: Self = StObject.set(x, "removeTime", null)
    
    inline def setRemoveTimeUndefined: Self = StObject.set(x, "removeTime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
