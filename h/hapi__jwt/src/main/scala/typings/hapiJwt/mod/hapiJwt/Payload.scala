package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Payload extends StObject {
  
  /**
    * The "aud" (audience) claim identifies the recipients that the JWT is intended for. Expressed in a string.
    */
  var aud: js.UndefOr[String] = js.undefined
  
  /**
    * The "exp" (expiration time) claim identifies the expiration time on or after which the JWT MUST NOT be accepted for processing. Expressed in NumericDate.
    */
  var exp: js.UndefOr[Double] = js.undefined
  
  /**
    * The "iat" (issued at) claim identifies the time at which the JWT was issued. Expressed in NumericDate.
    */
  var iat: js.UndefOr[Double] = js.undefined
  
  /**
    * The "iss" (issuer) claim identifies the principal that issued the JWT. Expressed in a string.
    */
  var iss: js.UndefOr[String] = js.undefined
  
  /**
    * The "jti" (JWT ID) claim provides a unique identifier for the JWT. Expressed in a string.
    */
  var jti: js.UndefOr[String] = js.undefined
  
  /**
    * The "nbf" (not before) claim identifies the time before which the JWT MUST NOT be accepted for processing. Expressed in NumericDate.
    */
  var nbf: js.UndefOr[Double] = js.undefined
  
  /**
    * While nonce is not an RFC 7519 Registered Claim, it is used on Open ID for the ID Tokens.
    */
  var nonce: js.UndefOr[String] = js.undefined
  
  /**
    * The "sub" (subject) claim identifies the principal that is the subject of the JWT. Expressed in a string.
    */
  var sub: js.UndefOr[String] = js.undefined
}
object Payload {
  
  inline def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
    
    inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
    
    inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
