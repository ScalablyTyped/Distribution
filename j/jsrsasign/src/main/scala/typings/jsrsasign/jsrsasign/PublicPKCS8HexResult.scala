package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.G
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicPKCS8HexResult extends StObject {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String
  
  /** hexadecimal string of OID of ECC curve name, parameter SEQUENCE of DSA or null */
  var algparam: String | G | Null
  
  /** hexadecimal string of public key */
  var key: String
}
object PublicPKCS8HexResult {
  
  inline def apply(algoid: String, key: String): PublicPKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], algparam = null)
    __obj.asInstanceOf[PublicPKCS8HexResult]
  }
  
  extension [Self <: PublicPKCS8HexResult](x: Self) {
    
    inline def setAlgoid(value: String): Self = StObject.set(x, "algoid", value.asInstanceOf[js.Any])
    
    inline def setAlgparam(value: String | G): Self = StObject.set(x, "algparam", value.asInstanceOf[js.Any])
    
    inline def setAlgparamNull: Self = StObject.set(x, "algparam", null)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
