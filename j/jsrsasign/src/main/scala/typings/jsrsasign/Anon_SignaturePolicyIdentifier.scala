package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SignaturePolicyIdentifier extends js.Object {
  var SignaturePolicyIdentifier: Anon_HashOid
  var SigningCertificateV2: ArrayParam[String] | Anon_Array | typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
  var SigningTime: TypeParam | StringParam
}

object Anon_SignaturePolicyIdentifier {
  @scala.inline
  def apply(
    SignaturePolicyIdentifier: Anon_HashOid,
    SigningCertificateV2: ArrayParam[String] | Anon_Array | SigningCertificateV2,
    SigningTime: TypeParam | StringParam
  ): Anon_SignaturePolicyIdentifier = {
    val __obj = js.Dynamic.literal(SignaturePolicyIdentifier = SignaturePolicyIdentifier.asInstanceOf[js.Any], SigningCertificateV2 = SigningCertificateV2.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SignaturePolicyIdentifier]
  }
}

