package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailLinkSigninResponse extends StObject {
  
  /**
    * The user's email.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expiration time of STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The STS id token to login the newly signed in user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the user is new.
    */
  var isNewUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#EmailLinkSigninResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The RP local ID of the user.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The refresh token for the signed in user.
    */
  var refreshToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaEmailLinkSigninResponse {
  
  inline def apply(): SchemaEmailLinkSigninResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailLinkSigninResponse]
  }
  
  extension [Self <: SchemaEmailLinkSigninResponse](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
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
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
