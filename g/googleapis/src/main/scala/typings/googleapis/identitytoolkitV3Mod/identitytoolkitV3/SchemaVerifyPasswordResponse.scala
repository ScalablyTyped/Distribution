package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerifyPasswordResponse extends StObject {
  
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email returned by the IdP. NOTE: The federated login user may not own the email.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GITKit token for authenticated user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#VerifyPasswordResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The RP local ID if it's already been mapped to the IdP account identified by the federated ID.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OAuth2 access token.
    */
  var oauthAccessToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OAuth2 authorization code.
    */
  var oauthAuthorizationCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The lifetime in seconds of the OAuth2 access token.
    */
  var oauthExpireIn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URI of the user's photo at IdP
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the email is registered.
    */
  var registered: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaVerifyPasswordResponse {
  
  inline def apply(): SchemaVerifyPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyPasswordResponse]
  }
  
  extension [Self <: SchemaVerifyPasswordResponse](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
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
    
    inline def setOauthAccessToken(value: String): Self = StObject.set(x, "oauthAccessToken", value.asInstanceOf[js.Any])
    
    inline def setOauthAccessTokenNull: Self = StObject.set(x, "oauthAccessToken", null)
    
    inline def setOauthAccessTokenUndefined: Self = StObject.set(x, "oauthAccessToken", js.undefined)
    
    inline def setOauthAuthorizationCode(value: String): Self = StObject.set(x, "oauthAuthorizationCode", value.asInstanceOf[js.Any])
    
    inline def setOauthAuthorizationCodeNull: Self = StObject.set(x, "oauthAuthorizationCode", null)
    
    inline def setOauthAuthorizationCodeUndefined: Self = StObject.set(x, "oauthAuthorizationCode", js.undefined)
    
    inline def setOauthExpireIn(value: Double): Self = StObject.set(x, "oauthExpireIn", value.asInstanceOf[js.Any])
    
    inline def setOauthExpireInNull: Self = StObject.set(x, "oauthExpireIn", null)
    
    inline def setOauthExpireInUndefined: Self = StObject.set(x, "oauthExpireIn", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setRegistered(value: Boolean): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    inline def setRegisteredNull: Self = StObject.set(x, "registered", null)
    
    inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
  }
}
