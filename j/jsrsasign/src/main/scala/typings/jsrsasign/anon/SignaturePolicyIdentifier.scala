package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignaturePolicyIdentifier extends StObject {
  
  var SignaturePolicyIdentifier: Oid
  
  var SigningCertificateV2: ArrayParam[String] | Array | typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
  
  var SigningTime: TypeParam | StringParam
}
object SignaturePolicyIdentifier {
  
  inline def apply(
    SignaturePolicyIdentifier: Oid,
    SigningCertificateV2: ArrayParam[String] | Array | SigningCertificateV2,
    SigningTime: TypeParam | StringParam
  ): SignaturePolicyIdentifier = {
    val __obj = js.Dynamic.literal(SignaturePolicyIdentifier = SignaturePolicyIdentifier.asInstanceOf[js.Any], SigningCertificateV2 = SigningCertificateV2.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturePolicyIdentifier]
  }
  
  extension [Self <: SignaturePolicyIdentifier](x: Self) {
    
    inline def setSignaturePolicyIdentifier(value: Oid): Self = StObject.set(x, "SignaturePolicyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificateV2(value: ArrayParam[String] | Array | SigningCertificateV2): Self = StObject.set(x, "SigningCertificateV2", value.asInstanceOf[js.Any])
    
    inline def setSigningTime(value: TypeParam | StringParam): Self = StObject.set(x, "SigningTime", value.asInstanceOf[js.Any])
  }
}
