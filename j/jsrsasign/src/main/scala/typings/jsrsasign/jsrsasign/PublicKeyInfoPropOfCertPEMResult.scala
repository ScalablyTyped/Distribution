package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyInfoPropOfCertPEMResult extends StObject {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String
  
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null
  
  /** hexadecimal string of key in the certificate */
  var keyhex: String
}
object PublicKeyInfoPropOfCertPEMResult {
  
  inline def apply(algoid: String, keyhex: String): PublicKeyInfoPropOfCertPEMResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyhex = keyhex.asInstanceOf[js.Any], algparam = null)
    __obj.asInstanceOf[PublicKeyInfoPropOfCertPEMResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyInfoPropOfCertPEMResult] (val x: Self) extends AnyVal {
    
    inline def setAlgoid(value: String): Self = StObject.set(x, "algoid", value.asInstanceOf[js.Any])
    
    inline def setAlgparam(value: String): Self = StObject.set(x, "algparam", value.asInstanceOf[js.Any])
    
    inline def setAlgparamNull: Self = StObject.set(x, "algparam", null)
    
    inline def setKeyhex(value: String): Self = StObject.set(x, "keyhex", value.asInstanceOf[js.Any])
  }
}
