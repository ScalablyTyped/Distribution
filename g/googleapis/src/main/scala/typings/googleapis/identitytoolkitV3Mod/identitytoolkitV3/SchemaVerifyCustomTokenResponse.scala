package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from verifying a custom token
  */
@js.native
trait SchemaVerifyCustomTokenResponse extends StObject {
  
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  
  /**
    * The GITKit token for authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * True if it&#39;s a new user sign-in, false if it&#39;s a returning user.
    */
  var isNewUser: js.UndefOr[Boolean] = js.native
  
  /**
    * The fixed string &quot;identitytoolkit#VerifyCustomTokenResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.native
}
object SchemaVerifyCustomTokenResponse {
  
  @scala.inline
  def apply(): SchemaVerifyCustomTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyCustomTokenResponse]
  }
  
  @scala.inline
  implicit class SchemaVerifyCustomTokenResponseMutableBuilder[Self <: SchemaVerifyCustomTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
