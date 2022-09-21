package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.FederatedId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetAccountInfoResponse extends StObject {
  
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Gitkit id token to login the newly sign up user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#SetAccountInfoResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new email the user attempts to change to.
    */
  var newEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's hashed password.
    */
  var passwordHash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's profiles at the associated IdPs.
    */
  var providerUserInfo: js.UndefOr[js.Array[FederatedId] | Null] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetAccountInfoResponse {
  
  inline def apply(): SchemaSetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetAccountInfoResponse]
  }
  
  extension [Self <: SchemaSetAccountInfoResponse](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedNull: Self = StObject.set(x, "emailVerified", null)
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    inline def setNewEmailNull: Self = StObject.set(x, "newEmail", null)
    
    inline def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    inline def setPasswordHashNull: Self = StObject.set(x, "passwordHash", null)
    
    inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProviderUserInfo(value: js.Array[FederatedId]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
    
    inline def setProviderUserInfoNull: Self = StObject.set(x, "providerUserInfo", null)
    
    inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
    
    inline def setProviderUserInfoVarargs(value: FederatedId*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
