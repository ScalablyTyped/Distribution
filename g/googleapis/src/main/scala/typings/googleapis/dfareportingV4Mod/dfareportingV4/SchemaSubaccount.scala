package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubaccount extends StObject {
  
  /**
    * ID of the account that contains this subaccount. This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IDs of the available user role permissions for this subaccount.
    */
  var availablePermissionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * ID of this subaccount. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#subaccount".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this subaccount. This is a required field. Must be less than 128 characters long and be unique among subaccounts of the same account.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubaccount {
  
  inline def apply(): SchemaSubaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubaccount]
  }
  
  extension [Self <: SchemaSubaccount](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAvailablePermissionIds(value: js.Array[String]): Self = StObject.set(x, "availablePermissionIds", value.asInstanceOf[js.Any])
    
    inline def setAvailablePermissionIdsNull: Self = StObject.set(x, "availablePermissionIds", null)
    
    inline def setAvailablePermissionIdsUndefined: Self = StObject.set(x, "availablePermissionIds", js.undefined)
    
    inline def setAvailablePermissionIdsVarargs(value: String*): Self = StObject.set(x, "availablePermissionIds", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
