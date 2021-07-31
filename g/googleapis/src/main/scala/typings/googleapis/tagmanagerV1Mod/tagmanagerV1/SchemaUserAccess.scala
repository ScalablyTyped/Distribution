package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
trait SchemaUserAccess extends StObject {
  
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.undefined
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container access permissions.
    */
  var containerAccess: js.UndefOr[js.Array[SchemaContainerAccess]] = js.undefined
  
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Account Permission ID.
    */
  var permissionId: js.UndefOr[String] = js.undefined
}
object SchemaUserAccess {
  
  @scala.inline
  def apply(): SchemaUserAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAccess]
  }
  
  @scala.inline
  implicit class SchemaUserAccessMutableBuilder[Self <: SchemaUserAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAccess(value: SchemaAccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerAccess(value: js.Array[SchemaContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
    
    @scala.inline
    def setContainerAccessVarargs(value: SchemaContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
  }
}
