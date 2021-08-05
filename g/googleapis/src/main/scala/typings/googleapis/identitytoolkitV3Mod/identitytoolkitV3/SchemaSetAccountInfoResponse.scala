package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.FederatedId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Respone of setting the account information.
  */
trait SchemaSetAccountInfoResponse extends StObject {
  
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * If email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.undefined
  
  /**
    * The Gitkit id token to login the newly sign up user.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * The fixed string &quot;identitytoolkit#SetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.undefined
  
  /**
    * The new email the user attempts to change to.
    */
  var newEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s hashed password.
    */
  var passwordHash: js.UndefOr[String] = js.undefined
  
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s profiles at the associated IdPs.
    */
  var providerUserInfo: js.UndefOr[js.Array[FederatedId]] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.undefined
}
object SchemaSetAccountInfoResponse {
  
  inline def apply(): SchemaSetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetAccountInfoResponse]
  }
  
  extension [Self <: SchemaSetAccountInfoResponse](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    inline def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProviderUserInfo(value: js.Array[FederatedId]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
    
    inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
    
    inline def setProviderUserInfoVarargs(value: FederatedId*): Self = StObject.set(x, "providerUserInfo", js.Array(value :_*))
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
