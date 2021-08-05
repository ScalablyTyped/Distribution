package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicRawRSAKeyHexResult extends StObject {
  
  /** hexadecimal string of public exponent */
  var e: String
  
  /** hexadecimal string of public key */
  var n: String
}
object PublicRawRSAKeyHexResult {
  
  inline def apply(e: String, n: String): PublicRawRSAKeyHexResult = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicRawRSAKeyHexResult]
  }
  
  extension [Self <: PublicRawRSAKeyHexResult](x: Self) {
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
