package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserAccess extends StObject {
  
  /**
    * GTM Account access permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.undefined
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Container access permissions. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update
    */
  var containerAccess: js.UndefOr[js.Array[SchemaContainerAccess]] = js.undefined
  
  /**
    * User's email address. @mutable tagmanager.accounts.permissions.create
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account Permission ID.
    */
  var permissionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserAccess {
  
  inline def apply(): SchemaUserAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAccess]
  }
  
  extension [Self <: SchemaUserAccess](x: Self) {
    
    inline def setAccountAccess(value: SchemaAccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
    
    inline def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerAccess(value: js.Array[SchemaContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
    
    inline def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
    
    inline def setContainerAccessVarargs(value: SchemaContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value*))
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
  }
}
