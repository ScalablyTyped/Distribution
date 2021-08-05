package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSRHexResult extends StObject {
  
  /** hexadecimal string of subject public key in PKCS#8 */
  var p8pubkeyhex: String
}
object CSRHexResult {
  
  inline def apply(p8pubkeyhex: String): CSRHexResult = {
    val __obj = js.Dynamic.literal(p8pubkeyhex = p8pubkeyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRHexResult]
  }
  
  extension [Self <: CSRHexResult](x: Self) {
    
    inline def setP8pubkeyhex(value: String): Self = StObject.set(x, "p8pubkeyhex", value.asInstanceOf[js.Any])
  }
}
