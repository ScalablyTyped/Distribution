package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyInfoPropOfCertPEMResult extends StObject {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String = js.native
  
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null = js.native
  
  /** hexadecimal string of key in the certificate */
  var keyhex: String = js.native
}
object PublicKeyInfoPropOfCertPEMResult {
  
  @scala.inline
  def apply(algoid: String, keyhex: String): PublicKeyInfoPropOfCertPEMResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyhex = keyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfoPropOfCertPEMResult]
  }
  
  @scala.inline
  implicit class PublicKeyInfoPropOfCertPEMResultMutableBuilder[Self <: PublicKeyInfoPropOfCertPEMResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgoid(value: String): Self = StObject.set(x, "algoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparam(value: String): Self = StObject.set(x, "algparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparamNull: Self = StObject.set(x, "algparam", null)
    
    @scala.inline
    def setKeyhex(value: String): Self = StObject.set(x, "keyhex", value.asInstanceOf[js.Any])
  }
}
