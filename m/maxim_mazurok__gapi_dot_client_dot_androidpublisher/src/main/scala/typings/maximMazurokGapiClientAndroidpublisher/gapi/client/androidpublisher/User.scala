package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /** Output only. The state of the user's access to the Play Console. */
  var accessState: js.UndefOr[String] = js.undefined
  
  /** Permissions for the user which apply across the developer account. */
  var developerAccountPermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Immutable. The user's email address. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The time at which the user's access expires, if set. When setting this value, it must always be in the future. */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Per-app permissions for the user. */
  var grants: js.UndefOr[js.Array[Grant]] = js.undefined
  
  /** Required. Resource name for this user, following the pattern "developers/{developer}/users/{email}". */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Whether there are more permissions for the user that are not represented here. This can happen if the caller does not have permission to manage all apps in the account.
    * This is also `true` if this user is the account owner. If this field is `true`, it should be taken as a signal that this user cannot be fully managed via the API. That is, the API
    * caller is not be able to manage all of the permissions this user holds, either because it doesn't know about them or because the user is the account owner.
    */
  var partial: js.UndefOr[Boolean] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setAccessState(value: String): Self = StObject.set(x, "accessState", value.asInstanceOf[js.Any])
    
    inline def setAccessStateUndefined: Self = StObject.set(x, "accessState", js.undefined)
    
    inline def setDeveloperAccountPermissions(value: js.Array[String]): Self = StObject.set(x, "developerAccountPermissions", value.asInstanceOf[js.Any])
    
    inline def setDeveloperAccountPermissionsUndefined: Self = StObject.set(x, "developerAccountPermissions", js.undefined)
    
    inline def setDeveloperAccountPermissionsVarargs(value: String*): Self = StObject.set(x, "developerAccountPermissions", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setGrants(value: js.Array[Grant]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
    
    inline def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "grants", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
  }
}
