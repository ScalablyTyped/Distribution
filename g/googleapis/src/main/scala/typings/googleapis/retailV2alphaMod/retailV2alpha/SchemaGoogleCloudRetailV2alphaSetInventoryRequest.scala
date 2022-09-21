package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSetInventoryRequest extends StObject {
  
  /**
    * If set to true, and the Product with name Product.name is not found, the inventory update will still be processed and retained for at most 1 day until the Product is created. If set to false, a NOT_FOUND error is returned if the Product is not found.
    */
  var allowMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The inventory information to update. The allowable fields to update are: * Product.price_info * Product.availability * Product.available_quantity * Product.fulfillment_info The updated inventory fields must be specified in SetInventoryRequest.set_mask. If SetInventoryRequest.inventory.name is empty or invalid, an INVALID_ARGUMENT error is returned. If the caller does not have permission to update the Product named in Product.name, regardless of whether or not it exists, a PERMISSION_DENIED error is returned. If the Product to update does not have existing inventory information, the provided inventory information will be inserted. If the Product to update has existing inventory information, the provided inventory information will be merged while respecting the last update time for each inventory field, using the provided or default value for SetInventoryRequest.set_time. The caller can replace place IDs for a subset of fulfillment types in the following ways: * Adds "fulfillment_info" in SetInventoryRequest.set_mask * Specifies only the desired fulfillment types and corresponding place IDs to update in SetInventoryRequest.inventory.fulfillment_info The caller can clear all place IDs from a subset of fulfillment types in the following ways: * Adds "fulfillment_info" in SetInventoryRequest.set_mask * Specifies only the desired fulfillment types to clear in SetInventoryRequest.inventory.fulfillment_info * Checks that only the desired fulfillment info types have empty SetInventoryRequest.inventory.fulfillment_info.place_ids The last update time is recorded for the following inventory fields: * Product.price_info * Product.availability * Product.available_quantity * Product.fulfillment_info If a full overwrite of inventory information while ignoring timestamps is needed, ProductService.UpdateProduct should be invoked instead.
    */
  var inventory: js.UndefOr[SchemaGoogleCloudRetailV2alphaProduct] = js.undefined
  
  /**
    * Indicates which inventory fields in the provided Product to update. At least one field must be provided. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned and the entire update will be ignored.
    */
  var setMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the request is issued, used to prevent out-of-order updates on inventory fields with the last update time recorded. If not provided, the internal system time will be used.
    */
  var setTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSetInventoryRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSetInventoryRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSetInventoryRequest](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingNull: Self = StObject.set(x, "allowMissing", null)
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setInventory(value: SchemaGoogleCloudRetailV2alphaProduct): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    inline def setSetMask(value: String): Self = StObject.set(x, "setMask", value.asInstanceOf[js.Any])
    
    inline def setSetMaskNull: Self = StObject.set(x, "setMask", null)
    
    inline def setSetMaskUndefined: Self = StObject.set(x, "setMask", js.undefined)
    
    inline def setSetTime(value: String): Self = StObject.set(x, "setTime", value.asInstanceOf[js.Any])
    
    inline def setSetTimeNull: Self = StObject.set(x, "setTime", null)
    
    inline def setSetTimeUndefined: Self = StObject.set(x, "setTime", js.undefined)
  }
}
