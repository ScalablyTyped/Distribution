package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The merchant account&#39;s shipping settings. All methods except
  * getsupportedcarriers and getsupportedholidays require the admin role.
  */
trait SchemaShippingSettings extends StObject {
  
  /**
    * The ID of the account to which these account shipping settings belong.
    * Ignored upon update, always present in get request responses.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of postal code groups that can be referred to in services.
    * Optional.
    */
  var postalCodeGroups: js.UndefOr[js.Array[SchemaPostalCodeGroup]] = js.undefined
  
  /**
    * The target account&#39;s list of services. Optional.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.undefined
}
object SchemaShippingSettings {
  
  inline def apply(): SchemaShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingSettings]
  }
  
  extension [Self <: SchemaShippingSettings](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setPostalCodeGroups(value: js.Array[SchemaPostalCodeGroup]): Self = StObject.set(x, "postalCodeGroups", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeGroupsUndefined: Self = StObject.set(x, "postalCodeGroups", js.undefined)
    
    inline def setPostalCodeGroupsVarargs(value: SchemaPostalCodeGroup*): Self = StObject.set(x, "postalCodeGroups", js.Array(value :_*))
    
    inline def setServices(value: js.Array[SchemaService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
