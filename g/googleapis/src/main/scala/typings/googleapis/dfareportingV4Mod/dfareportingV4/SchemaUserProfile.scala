package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserProfile extends StObject {
  
  /**
    * The account ID to which this profile belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The account name this profile belongs to.
    */
  var accountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#userProfile".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the user profile.
    */
  var profileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sub account ID this profile belongs to if applicable.
    */
  var subAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sub account name this profile belongs to if applicable.
    */
  var subAccountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user name.
    */
  var userName: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserProfile {
  
  inline def apply(): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfile]
  }
  
  extension [Self <: SchemaUserProfile](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdNull: Self = StObject.set(x, "profileId", null)
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    inline def setSubAccountIdNull: Self = StObject.set(x, "subAccountId", null)
    
    inline def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
    
    inline def setSubAccountName(value: String): Self = StObject.set(x, "subAccountName", value.asInstanceOf[js.Any])
    
    inline def setSubAccountNameNull: Self = StObject.set(x, "subAccountName", null)
    
    inline def setSubAccountNameUndefined: Self = StObject.set(x, "subAccountName", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
