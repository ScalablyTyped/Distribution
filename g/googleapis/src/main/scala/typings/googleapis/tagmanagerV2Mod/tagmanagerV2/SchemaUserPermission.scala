package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
trait SchemaUserPermission extends StObject {
  
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[SchemaAccountAccess] = js.undefined
  
  /**
    * The Account ID uniquely identifies the GTM Account.
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
    * GTM UserPermission&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaUserPermission {
  
  inline def apply(): SchemaUserPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPermission]
  }
  
  extension [Self <: SchemaUserPermission](x: Self) {
    
    inline def setAccountAccess(value: SchemaAccountAccess): Self = StObject.set(x, "accountAccess", value.asInstanceOf[js.Any])
    
    inline def setAccountAccessUndefined: Self = StObject.set(x, "accountAccess", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerAccess(value: js.Array[SchemaContainerAccess]): Self = StObject.set(x, "containerAccess", value.asInstanceOf[js.Any])
    
    inline def setContainerAccessUndefined: Self = StObject.set(x, "containerAccess", js.undefined)
    
    inline def setContainerAccessVarargs(value: SchemaContainerAccess*): Self = StObject.set(x, "containerAccess", js.Array(value :_*))
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
