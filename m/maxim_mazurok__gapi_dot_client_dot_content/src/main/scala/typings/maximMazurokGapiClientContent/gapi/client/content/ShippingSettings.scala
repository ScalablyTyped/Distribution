package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingSettings extends StObject {
  
  /** The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** A list of postal code groups that can be referred to in `services`. Optional. */
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.undefined
  
  /** The target account's list of services. Optional. */
  var services: js.UndefOr[js.Array[Service]] = js.undefined
  
  /** Optional. A list of warehouses which can be referred to in `services`. */
  var warehouses: js.UndefOr[js.Array[Warehouse]] = js.undefined
}
object ShippingSettings {
  
  inline def apply(): ShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingSettings] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setPostalCodeGroups(value: js.Array[PostalCodeGroup]): Self = StObject.set(x, "postalCodeGroups", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeGroupsUndefined: Self = StObject.set(x, "postalCodeGroups", js.undefined)
    
    inline def setPostalCodeGroupsVarargs(value: PostalCodeGroup*): Self = StObject.set(x, "postalCodeGroups", js.Array(value*))
    
    inline def setServices(value: js.Array[Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setWarehouses(value: js.Array[Warehouse]): Self = StObject.set(x, "warehouses", value.asInstanceOf[js.Any])
    
    inline def setWarehousesUndefined: Self = StObject.set(x, "warehouses", js.undefined)
    
    inline def setWarehousesVarargs(value: Warehouse*): Self = StObject.set(x, "warehouses", js.Array(value*))
  }
}
