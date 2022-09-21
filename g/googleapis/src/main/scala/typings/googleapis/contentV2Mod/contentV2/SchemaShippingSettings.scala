package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShippingSettings extends StObject {
  
  /**
    * The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of postal code groups that can be referred to in `services`. Optional.
    */
  var postalCodeGroups: js.UndefOr[js.Array[SchemaPostalCodeGroup]] = js.undefined
  
  /**
    * The target account's list of services. Optional.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.undefined
  
  /**
    * Optional. A list of warehouses which can be referred to in `services`.
    */
  var warehouses: js.UndefOr[js.Array[SchemaWarehouse]] = js.undefined
}
object SchemaShippingSettings {
  
  inline def apply(): SchemaShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingSettings]
  }
  
  extension [Self <: SchemaShippingSettings](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setPostalCodeGroups(value: js.Array[SchemaPostalCodeGroup]): Self = StObject.set(x, "postalCodeGroups", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeGroupsUndefined: Self = StObject.set(x, "postalCodeGroups", js.undefined)
    
    inline def setPostalCodeGroupsVarargs(value: SchemaPostalCodeGroup*): Self = StObject.set(x, "postalCodeGroups", js.Array(value*))
    
    inline def setServices(value: js.Array[SchemaService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaService*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setWarehouses(value: js.Array[SchemaWarehouse]): Self = StObject.set(x, "warehouses", value.asInstanceOf[js.Any])
    
    inline def setWarehousesUndefined: Self = StObject.set(x, "warehouses", js.undefined)
    
    inline def setWarehousesVarargs(value: SchemaWarehouse*): Self = StObject.set(x, "warehouses", js.Array(value*))
  }
}
