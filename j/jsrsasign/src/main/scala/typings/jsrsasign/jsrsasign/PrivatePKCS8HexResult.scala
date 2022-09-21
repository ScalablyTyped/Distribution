package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivatePKCS8HexResult extends StObject {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String
  
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null
  
  /** string starting index of key in `pkcs8PrvHex` */
  var keyidx: Double
}
object PrivatePKCS8HexResult {
  
  inline def apply(algoid: String, keyidx: Double): PrivatePKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyidx = keyidx.asInstanceOf[js.Any], algparam = null)
    __obj.asInstanceOf[PrivatePKCS8HexResult]
  }
  
  extension [Self <: PrivatePKCS8HexResult](x: Self) {
    
    inline def setAlgoid(value: String): Self = StObject.set(x, "algoid", value.asInstanceOf[js.Any])
    
    inline def setAlgparam(value: String): Self = StObject.set(x, "algparam", value.asInstanceOf[js.Any])
    
    inline def setAlgparamNull: Self = StObject.set(x, "algparam", null)
    
    inline def setKeyidx(value: Double): Self = StObject.set(x, "keyidx", value.asInstanceOf[js.Any])
  }
}
