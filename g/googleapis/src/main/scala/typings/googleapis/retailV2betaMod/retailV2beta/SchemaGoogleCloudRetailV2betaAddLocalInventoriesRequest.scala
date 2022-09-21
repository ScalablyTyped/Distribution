package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaAddLocalInventoriesRequest extends StObject {
  
  /**
    * Indicates which inventory fields in the provided list of LocalInventory to update. The field is updated to the provided value. If a field is set while the place does not have a previous local inventory, the local inventory at that store is created. If a field is set while the value of that field is not provided, the original field value, if it exists, is deleted. If the mask is not set or set with empty paths, all inventory fields will be updated. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned and the entire update will be ignored.
    */
  var addMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the inventory updates are issued. Used to prevent out-of-order updates on local inventory fields. If not provided, the internal system time will be used.
    */
  var addTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to true, and the Product is not found, the local inventory will still be processed and retained for at most 1 day and processed once the Product is created. If set to false, a NOT_FOUND error is returned if the Product is not found.
    */
  var allowMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. A list of inventory information at difference places. Each place is identified by its place ID. At most 3000 inventories are allowed per request.
    */
  var localInventories: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaLocalInventory]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaAddLocalInventoriesRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaAddLocalInventoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaAddLocalInventoriesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaAddLocalInventoriesRequest](x: Self) {
    
    inline def setAddMask(value: String): Self = StObject.set(x, "addMask", value.asInstanceOf[js.Any])
    
    inline def setAddMaskNull: Self = StObject.set(x, "addMask", null)
    
    inline def setAddMaskUndefined: Self = StObject.set(x, "addMask", js.undefined)
    
    inline def setAddTime(value: String): Self = StObject.set(x, "addTime", value.asInstanceOf[js.Any])
    
    inline def setAddTimeNull: Self = StObject.set(x, "addTime", null)
    
    inline def setAddTimeUndefined: Self = StObject.set(x, "addTime", js.undefined)
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingNull: Self = StObject.set(x, "allowMissing", null)
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setLocalInventories(value: js.Array[SchemaGoogleCloudRetailV2betaLocalInventory]): Self = StObject.set(x, "localInventories", value.asInstanceOf[js.Any])
    
    inline def setLocalInventoriesUndefined: Self = StObject.set(x, "localInventories", js.undefined)
    
    inline def setLocalInventoriesVarargs(value: SchemaGoogleCloudRetailV2betaLocalInventory*): Self = StObject.set(x, "localInventories", js.Array(value*))
  }
}
