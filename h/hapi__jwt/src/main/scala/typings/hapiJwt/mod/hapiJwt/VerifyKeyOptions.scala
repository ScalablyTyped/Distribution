package typings.hapiJwt.mod.hapiJwt

import typings.hapiJwt.hapiJwtBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Plugin definitions
trait VerifyKeyOptions extends StObject {
  
  /**
    * String or RegExp or array of strings or RegExp that matches the audience of the token. Set to boolean false to not verify aud.
    */
  var aud: String | (js.Array[js.RegExp | String]) | js.RegExp | `false`
  
  /**
    * Boolean to determine if the "Expiration Time" NumericDate of the token should be validated. Default is true.
    */
  var exp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String or array of strings that matches the issuer of the token. Set to boolean false to not verify iss.
    */
  var iss: String | js.Array[String] | `false`
  
  /**
    * Integer to determine the maximum age of the token in seconds. Default is 0.
    */
  var maxAgeSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Boolean to determine if the "Not Before" NumericDate of the token should be validated. Default is true.
    */
  var nbf: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String or array of strings that matches the subject of the token. Set to boolean false to not verify sub.
    */
  var sub: String | js.Array[String] | `false`
  
  /**
    * Integer to adust exp and maxAgeSec to account for server time drift in seconds. Default is 0.
    */
  var timeSkewSec: js.UndefOr[Double] = js.undefined
}
object VerifyKeyOptions {
  
  inline def apply(
    aud: String | (js.Array[js.RegExp | String]) | js.RegExp | `false`,
    iss: String | js.Array[String] | `false`,
    sub: String | js.Array[String] | `false`
  ): VerifyKeyOptions = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setAud(value: String | (js.Array[js.RegExp | String]) | js.RegExp | `false`): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "aud", js.Array(value*))
    
    inline def setExp(value: Boolean): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIss(value: String | js.Array[String] | `false`): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssVarargs(value: String*): Self = StObject.set(x, "iss", js.Array(value*))
    
    inline def setMaxAgeSec(value: Double): Self = StObject.set(x, "maxAgeSec", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecUndefined: Self = StObject.set(x, "maxAgeSec", js.undefined)
    
    inline def setNbf(value: Boolean): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
    
    inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
    
    inline def setSub(value: String | js.Array[String] | `false`): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value*))
    
    inline def setTimeSkewSec(value: Double): Self = StObject.set(x, "timeSkewSec", value.asInstanceOf[js.Any])
    
    inline def setTimeSkewSecUndefined: Self = StObject.set(x, "timeSkewSec", js.undefined)
  }
}
