package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashAlg extends js.Object {
  var hashAlg: String
  var sAttr: AnonSignaturePolicyIdentifier
  var sigAlg: String
  var signerCert: String
  var signerPrvKey: String
}

object AnonHashAlg {
  @scala.inline
  def apply(
    hashAlg: String,
    sAttr: AnonSignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): AnonHashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], sAttr = sAttr.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashAlg]
  }
}

