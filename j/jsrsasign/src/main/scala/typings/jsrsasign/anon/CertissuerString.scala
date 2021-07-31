package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertissuerString
  extends StObject
     with GeneralNameParam {
  
  var certissuer: String
}
object CertissuerString {
  
  @scala.inline
  def apply(certissuer: String): CertissuerString = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertissuerString]
  }
  
  @scala.inline
  implicit class CertissuerStringMutableBuilder[Self <: CertissuerString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertissuer(value: String): Self = StObject.set(x, "certissuer", value.asInstanceOf[js.Any])
  }
}
