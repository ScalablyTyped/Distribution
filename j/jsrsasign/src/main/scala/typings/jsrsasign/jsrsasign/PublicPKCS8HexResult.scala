package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicPKCS8HexResult extends StObject {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String = js.native
  
  /** hexadecimal string of OID of ECC curve name, parameter SEQUENCE of DSA or null */
  var algparam: String = js.native
  
  /** hexadecimal string of public key */
  var key: String = js.native
}
object PublicPKCS8HexResult {
  
  @scala.inline
  def apply(algoid: String, algparam: String, key: String): PublicPKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicPKCS8HexResult]
  }
  
  @scala.inline
  implicit class PublicPKCS8HexResultMutableBuilder[Self <: PublicPKCS8HexResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgoid(value: String): Self = StObject.set(x, "algoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparam(value: String): Self = StObject.set(x, "algparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
