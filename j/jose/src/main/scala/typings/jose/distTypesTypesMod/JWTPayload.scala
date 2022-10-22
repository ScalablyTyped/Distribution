package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTPayload
  extends StObject
     with /* propName */ StringDictionary[Any] {
  
  /** JWT Audience [RFC7519#section-4.1.3](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.3). */
  var aud: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * JWT Expiration Time
    *
    * @see [RFC7519#section-4.1.4](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.4)
    */
  var exp: js.UndefOr[Double] = js.undefined
  
  /**
    * JWT Issued At
    *
    * @see [RFC7519#section-4.1.6](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.6)
    */
  var iat: js.UndefOr[Double] = js.undefined
  
  /**
    * JWT Issuer
    *
    * @see [RFC7519#section-4.1.1](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.1)
    */
  var iss: js.UndefOr[String] = js.undefined
  
  /**
    * JWT ID
    *
    * @see [RFC7519#section-4.1.7](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.7)
    */
  var jti: js.UndefOr[String] = js.undefined
  
  /**
    * JWT Not Before
    *
    * @see [RFC7519#section-4.1.5](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.5)
    */
  var nbf: js.UndefOr[Double] = js.undefined
  
  /**
    * JWT Subject
    *
    * @see [RFC7519#section-4.1.2](https://www.rfc-editor.org/rfc/rfc7519#section-4.1.2)
    */
  var sub: js.UndefOr[String] = js.undefined
}
object JWTPayload {
  
  inline def apply(): JWTPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTPayload]
  }
  
  extension [Self <: JWTPayload](x: Self) {
    
    inline def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
    
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
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
