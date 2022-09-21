package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignerCert extends StObject {
  
  var certs: js.Array[String]
  
  var hashAlg: String
  
  var sigAlg: String
  
  var signerCert: String
  
  var signerPrvKey: String
  
  var tstInfo: TSTInfo
}
object SignerCert {
  
  inline def apply(
    certs: js.Array[String],
    hashAlg: String,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String,
    tstInfo: TSTInfo
  ): SignerCert = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any], tstInfo = tstInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerCert]
  }
  
  extension [Self <: SignerCert](x: Self) {
    
    inline def setCerts(value: js.Array[String]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsVarargs(value: String*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setSigAlg(value: String): Self = StObject.set(x, "sigAlg", value.asInstanceOf[js.Any])
    
    inline def setSignerCert(value: String): Self = StObject.set(x, "signerCert", value.asInstanceOf[js.Any])
    
    inline def setSignerPrvKey(value: String): Self = StObject.set(x, "signerPrvKey", value.asInstanceOf[js.Any])
    
    inline def setTstInfo(value: TSTInfo): Self = StObject.set(x, "tstInfo", value.asInstanceOf[js.Any])
  }
}
