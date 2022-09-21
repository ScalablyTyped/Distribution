package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerifyCustomTokenResponse extends StObject {
  
  /**
    * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GITKit token for authenticated user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if it's a new user sign-in, false if it's a returning user.
    */
  var isNewUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#VerifyCustomTokenResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerifyCustomTokenResponse {
  
  inline def apply(): SchemaVerifyCustomTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyCustomTokenResponse]
  }
  
  extension [Self <: SchemaVerifyCustomTokenResponse](x: Self) {
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setIsNewUserNull: Self = StObject.set(x, "isNewUser", null)
    
    inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
