package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateTBSParamsUnsigned
  extends StObject
     with X509CertificateParams {
  
  var cakey: String | RSAKey | DSA | ECDSA
  
  var sigalg: String
  
  var tbsobj: TBSCertificate
}
object X509CertificateTBSParamsUnsigned {
  
  inline def apply(cakey: String | RSAKey | DSA | ECDSA, sigalg: String, tbsobj: TBSCertificate): X509CertificateTBSParamsUnsigned = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateTBSParamsUnsigned]
  }
  
  extension [Self <: X509CertificateTBSParamsUnsigned](x: Self) {
    
    inline def setCakey(value: String | RSAKey | DSA | ECDSA): Self = StObject.set(x, "cakey", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setTbsobj(value: TBSCertificate): Self = StObject.set(x, "tbsobj", value.asInstanceOf[js.Any])
  }
}
