package typings.jwa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algorithm: Algorithm): JWA = ^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any]).asInstanceOf[JWA]
  
  @JSImport("jwa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.jwa.jwaStrings.HS256
    - typings.jwa.jwaStrings.HS384
    - typings.jwa.jwaStrings.HS512
    - typings.jwa.jwaStrings.RS256
    - typings.jwa.jwaStrings.RS384
    - typings.jwa.jwaStrings.RS512
    - typings.jwa.jwaStrings.PS256
    - typings.jwa.jwaStrings.PS384
    - typings.jwa.jwaStrings.PS512
    - typings.jwa.jwaStrings.ES256
    - typings.jwa.jwaStrings.ES384
    - typings.jwa.jwaStrings.ES512
    - typings.jwa.jwaStrings.none
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def ES256: typings.jwa.jwaStrings.ES256 = "ES256".asInstanceOf[typings.jwa.jwaStrings.ES256]
    
    inline def ES384: typings.jwa.jwaStrings.ES384 = "ES384".asInstanceOf[typings.jwa.jwaStrings.ES384]
    
    inline def ES512: typings.jwa.jwaStrings.ES512 = "ES512".asInstanceOf[typings.jwa.jwaStrings.ES512]
    
    inline def HS256: typings.jwa.jwaStrings.HS256 = "HS256".asInstanceOf[typings.jwa.jwaStrings.HS256]
    
    inline def HS384: typings.jwa.jwaStrings.HS384 = "HS384".asInstanceOf[typings.jwa.jwaStrings.HS384]
    
    inline def HS512: typings.jwa.jwaStrings.HS512 = "HS512".asInstanceOf[typings.jwa.jwaStrings.HS512]
    
    inline def PS256: typings.jwa.jwaStrings.PS256 = "PS256".asInstanceOf[typings.jwa.jwaStrings.PS256]
    
    inline def PS384: typings.jwa.jwaStrings.PS384 = "PS384".asInstanceOf[typings.jwa.jwaStrings.PS384]
    
    inline def PS512: typings.jwa.jwaStrings.PS512 = "PS512".asInstanceOf[typings.jwa.jwaStrings.PS512]
    
    inline def RS256: typings.jwa.jwaStrings.RS256 = "RS256".asInstanceOf[typings.jwa.jwaStrings.RS256]
    
    inline def RS384: typings.jwa.jwaStrings.RS384 = "RS384".asInstanceOf[typings.jwa.jwaStrings.RS384]
    
    inline def RS512: typings.jwa.jwaStrings.RS512 = "RS512".asInstanceOf[typings.jwa.jwaStrings.RS512]
    
    inline def none: typings.jwa.jwaStrings.none = "none".asInstanceOf[typings.jwa.jwaStrings.none]
  }
  
  trait JWA extends StObject {
    
    def sign(input: String, secretOrPrivateKey: String): String
    
    def verify(input: String, signature: String, secretOrPublicKey: String): Boolean
  }
  object JWA {
    
    inline def apply(sign: (String, String) => String, verify: (String, String, String) => Boolean): JWA = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), verify = js.Any.fromFunction3(verify))
      __obj.asInstanceOf[JWA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWA] (val x: Self) extends AnyVal {
      
      inline def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setVerify(value: (String, String, String) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction3(value))
    }
  }
}
