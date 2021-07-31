package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigAlg extends StObject {
  
  var certs: js.Array[String]
  
  var hashAlg: String
  
  var sigAlg: String
  
  var signerCert: String
  
  var signerPrvKey: String
}
object SigAlg {
  
  @scala.inline
  def apply(certs: js.Array[String], hashAlg: String, sigAlg: String, signerCert: String, signerPrvKey: String): SigAlg = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigAlg]
  }
  
  @scala.inline
  implicit class SigAlgMutableBuilder[Self <: SigAlg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCerts(value: js.Array[String]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertsVarargs(value: String*): Self = StObject.set(x, "certs", js.Array(value :_*))
    
    @scala.inline
    def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigAlg(value: String): Self = StObject.set(x, "sigAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerCert(value: String): Self = StObject.set(x, "signerCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerPrvKey(value: String): Self = StObject.set(x, "signerPrvKey", value.asInstanceOf[js.Any])
  }
}
