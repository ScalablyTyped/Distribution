package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
@js.native
trait SchemaUserPermission extends StObject {
  
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.native
  
  /**
    * The Account ID uniquely identifies the GTM Account.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * GTM Container access permissions.
    */
  var containerAccess: js.UndefOr[js.Array[SchemaContainerAccess]] = js.native
  
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * GTM UserPermission&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
}
object SchemaUserPermission {
  
  @scala.inline
  def apply(): SchemaUserPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPermission]
  }
  
  @scala.inline
  implicit class SchemaUserPermissionMutableBuilder[Self <: SchemaUserPermission] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
