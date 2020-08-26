package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePolicyIdentifier extends js.Object {
  var SignaturePolicyIdentifier: Oid = js.native
  var SigningCertificateV2: ArrayParam[String] | Array | typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2 = js.native
  var SigningTime: TypeParam | StringParam = js.native
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
  @scala.inline
  implicit class SignaturePolicyIdentifierOps[Self <: SignaturePolicyIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSignaturePolicyIdentifier(value: Oid): Self = this.set("SignaturePolicyIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigningCertificateV2(value: ArrayParam[String] | Array | SigningCertificateV2): Self = this.set("SigningCertificateV2", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigningTime(value: TypeParam | StringParam): Self = this.set("SigningTime", value.asInstanceOf[js.Any])
  }
  
}

