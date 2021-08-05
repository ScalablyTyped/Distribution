package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserProfile extends StObject {
  
  /** The account ID to which this profile belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The account name this profile belongs to. */
  var accountName: js.UndefOr[String] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userProfile". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The unique ID of the user profile. */
  var profileId: js.UndefOr[String] = js.undefined
  
  /** The sub account ID this profile belongs to if applicable. */
  var subAccountId: js.UndefOr[String] = js.undefined
  
  /** The sub account name this profile belongs to if applicable. */
  var subAccountName: js.UndefOr[String] = js.undefined
  
  /** The user name. */
  var userName: js.UndefOr[String] = js.undefined
}
object UserProfile {
  
  inline def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  
  extension [Self <: UserProfile](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    inline def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
    
    inline def setSubAccountName(value: String): Self = StObject.set(x, "subAccountName", value.asInstanceOf[js.Any])
    
    inline def setSubAccountNameUndefined: Self = StObject.set(x, "subAccountName", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
