package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaLocalInventory extends StObject {
  
  /**
    * Additional local inventory attributes, for example, store name, promotion tags, etc. This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT error is returned: * At most 30 attributes are allowed. * The key must be a UTF-8 encoded string with a length limit of 32 characters. * The key must match the pattern: `a-zA-Z0-9*`. For example, key0LikeThis or KEY_1_LIKE_THIS. * The attribute values must be of the same type (text or number). * Only 1 value is allowed for each attribute. * For text values, the length limit is 256 UTF-8 characters. * The attribute does not support search. The `searchable` field should be unset or set to false. * The max summed total bytes of custom attribute keys and values per product is 5MiB.
    */
  var attributes: js.UndefOr[StringDictionary[SchemaGoogleCloudRetailV2alphaCustomAttribute] | Null] = js.undefined
  
  /**
    * Input only. Supported fulfillment types. Valid fulfillment type values include commonly used types (such as pickup in store and same day delivery), and custom types. Customers have to map custom types to their display names before rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned. All the elements must be distinct. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var fulfillmentTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The place ID for the current set of inventory information.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product price and cost information. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371).
    */
  var priceInfo: js.UndefOr[SchemaGoogleCloudRetailV2alphaPriceInfo] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaLocalInventory {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaLocalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaLocalInventory]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaLocalInventory](x: Self) {
    
    inline def setAttributes(value: StringDictionary[SchemaGoogleCloudRetailV2alphaCustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFulfillmentTypes(value: js.Array[String]): Self = StObject.set(x, "fulfillmentTypes", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentTypesNull: Self = StObject.set(x, "fulfillmentTypes", null)
    
    inline def setFulfillmentTypesUndefined: Self = StObject.set(x, "fulfillmentTypes", js.undefined)
    
    inline def setFulfillmentTypesVarargs(value: String*): Self = StObject.set(x, "fulfillmentTypes", js.Array(value*))
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setPriceInfo(value: SchemaGoogleCloudRetailV2alphaPriceInfo): Self = StObject.set(x, "priceInfo", value.asInstanceOf[js.Any])
    
    inline def setPriceInfoUndefined: Self = StObject.set(x, "priceInfo", js.undefined)
  }
}
