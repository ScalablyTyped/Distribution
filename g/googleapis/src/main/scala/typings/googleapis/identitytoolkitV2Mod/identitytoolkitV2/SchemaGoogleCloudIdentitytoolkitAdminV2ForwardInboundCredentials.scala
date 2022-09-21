package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials extends StObject {
  
  /**
    * Whether to pass the user's OAuth identity provider's access token.
    */
  var accessToken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to pass the user's OIDC identity provider's ID token.
    */
  var idToken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to pass the user's OAuth identity provider's refresh token.
    */
  var refreshToken: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials](x: Self) {
    
    inline def setAccessToken(value: Boolean): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setIdToken(value: Boolean): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setRefreshToken(value: Boolean): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
