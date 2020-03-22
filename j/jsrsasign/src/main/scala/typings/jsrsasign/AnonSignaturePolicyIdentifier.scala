package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignaturePolicyIdentifier extends js.Object {
  var SignaturePolicyIdentifier: AnonOid
  var SigningCertificateV2: ArrayParam[String] | AnonArray | typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
  var SigningTime: TypeParam | StringParam
}

object AnonSignaturePolicyIdentifier {
  @scala.inline
  def apply(
    SignaturePolicyIdentifier: AnonOid,
    SigningCertificateV2: ArrayParam[String] | AnonArray | SigningCertificateV2,
    SigningTime: TypeParam | StringParam
  ): AnonSignaturePolicyIdentifier = {
    val __obj = js.Dynamic.literal(SignaturePolicyIdentifier = SignaturePolicyIdentifier.asInstanceOf[js.Any], SigningCertificateV2 = SigningCertificateV2.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSignaturePolicyIdentifier]
  }
}

