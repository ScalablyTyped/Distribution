package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivatePKCS8HexResult extends StObject {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String = js.native
  
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null = js.native
  
  /** string starting index of key in `pkcs8PrvHex` */
  var keyidx: String = js.native
}
object PrivatePKCS8HexResult {
  
  @scala.inline
  def apply(algoid: String, keyidx: String): PrivatePKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyidx = keyidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivatePKCS8HexResult]
  }
  
  @scala.inline
  implicit class PrivatePKCS8HexResultMutableBuilder[Self <: PrivatePKCS8HexResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgoid(value: String): Self = StObject.set(x, "algoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparam(value: String): Self = StObject.set(x, "algparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparamNull: Self = StObject.set(x, "algparam", null)
    
    @scala.inline
    def setKeyidx(value: String): Self = StObject.set(x, "keyidx", value.asInstanceOf[js.Any])
  }
}
