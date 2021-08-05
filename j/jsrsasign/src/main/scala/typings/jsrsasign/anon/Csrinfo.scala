package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Csrinfo extends StObject {
  
  var csrinfo: CertificationRequestInfo
}
object Csrinfo {
  
  inline def apply(csrinfo: CertificationRequestInfo): Csrinfo = {
    val __obj = js.Dynamic.literal(csrinfo = csrinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csrinfo]
  }
  
  extension [Self <: Csrinfo](x: Self) {
    
    inline def setCsrinfo(value: CertificationRequestInfo): Self = StObject.set(x, "csrinfo", value.asInstanceOf[js.Any])
  }
}
