package typings.hapiJwt.mod.hapiJwt

import typings.hapiJwt.hapiJwtBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTokenOptions
  extends StObject
     with TimeOptions {
  
  /**
    * String or RegExp or array of strings or RegExp that matches the audience of the token. Set to boolean false to not verify aud.
    */
  var aud: String | (js.Array[js.RegExp | String]) | js.RegExp | `false`
  
  /**
    * String or array of strings that matches the issuer of the token. Set to boolean false to not verify iss.
    */
  var iss: String | js.Array[String] | `false`
  
  /**
    * String or array of strings that matches the JWT ID of the token.
    */
  var jti: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Integer that represents the "Not Before" NumericDate of the token.
    */
  var nbf: js.UndefOr[Double] = js.undefined
  
  /**
    * String or array of strings that matches the nonce of the token. nonce is used on Open ID for the ID Tokens.
    */
  var nonce: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * String or array of strings that matches the subject of the token. Set to boolean false to not verify sub.
    */
  var sub: String | js.Array[String] | `false`
}
object VerifyTokenOptions {
  
  inline def apply(
    aud: String | (js.Array[js.RegExp | String]) | js.RegExp | `false`,
    iss: String | js.Array[String] | `false`,
    sub: String | js.Array[String] | `false`
  ): VerifyTokenOptions = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTokenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyTokenOptions] (val x: Self) extends AnyVal {
    
    inline def setAud(value: String | (js.Array[js.RegExp | String]) | js.RegExp | `false`): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "aud", js.Array(value*))
    
    inline def setIss(value: String | js.Array[String] | `false`): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssVarargs(value: String*): Self = StObject.set(x, "iss", js.Array(value*))
    
    inline def setJti(value: String | js.Array[String]): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
    
    inline def setJtiVarargs(value: String*): Self = StObject.set(x, "jti", js.Array(value*))
    
    inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
    
    inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
    
    inline def setNonce(value: String | js.Array[String]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setNonceVarargs(value: String*): Self = StObject.set(x, "nonce", js.Array(value*))
    
    inline def setSub(value: String | js.Array[String] | `false`): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value*))
  }
}
