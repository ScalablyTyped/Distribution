package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaturePolicyIdentifier extends js.Object {
  var SignaturePolicyIdentifier: Oid
  var SigningCertificateV2: ArrayParam[String] | Array | typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
  var SigningTime: TypeParam | StringParam
}

object SignaturePolicyIdentifier {
  @scala.inline
  def apply(
    SignaturePolicyIdentifier: Oid,
    SigningCertificateV2: ArrayParam[String] | Array | SigningCertificateV2,
    SigningTime: TypeParam | StringParam
  ): SignaturePolicyIdentifier = {
    val __obj = js.Dynamic.literal(SignaturePolicyIdentifier = SignaturePolicyIdentifier.asInstanceOf[js.Any], SigningCertificateV2 = SigningCertificateV2.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturePolicyIdentifier]
  }
}

