package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateTBSParamsSigned
  extends StObject
     with X509CertificateParams {
  
  var sighex: String
  
  var tbsobj: TBSCertificate
}
object X509CertificateTBSParamsSigned {
  
  inline def apply(sighex: String, tbsobj: TBSCertificate): X509CertificateTBSParamsSigned = {
    val __obj = js.Dynamic.literal(sighex = sighex.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateTBSParamsSigned]
  }
  
  extension [Self <: X509CertificateTBSParamsSigned](x: Self) {
    
    inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
    
    inline def setTbsobj(value: TBSCertificate): Self = StObject.set(x, "tbsobj", value.asInstanceOf[js.Any])
  }
}
