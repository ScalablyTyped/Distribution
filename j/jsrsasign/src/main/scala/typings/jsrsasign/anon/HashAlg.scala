package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashAlg extends js.Object {
  var hashAlg: String
  var sAttr: SignaturePolicyIdentifier
  var sigAlg: String
  var signerCert: String
  var signerPrvKey: String
}

object HashAlg {
  @scala.inline
  def apply(
    hashAlg: String,
    sAttr: SignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): HashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], sAttr = sAttr.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlg]
  }
}

