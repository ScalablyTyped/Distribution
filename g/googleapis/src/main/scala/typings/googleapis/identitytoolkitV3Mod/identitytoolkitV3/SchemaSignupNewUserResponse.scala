package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of signing up new user, creating anonymous user or anonymous user
  * reauth.
  */
trait SchemaSignupNewUserResponse extends StObject {
  
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
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
    * The fixed string &quot;identitytoolkit#SignupNewUserResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The RP local ID of the user.
    */
  var localId: js.UndefOr[String] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.undefined
}
object SchemaSignupNewUserResponse {
  
  inline def apply(): SchemaSignupNewUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignupNewUserResponse]
  }
  
  extension [Self <: SchemaSignupNewUserResponse](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
