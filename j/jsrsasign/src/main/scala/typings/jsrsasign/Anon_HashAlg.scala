package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashAlg extends js.Object {
  var hashAlg: String
  var sAttr: Anon_SignaturePolicyIdentifier
  var sigAlg: String
  var signerCert: String
  var signerPrvKey: String
}

object Anon_HashAlg {
  @scala.inline
  def apply(
    hashAlg: String,
    sAttr: Anon_SignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): Anon_HashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg, sAttr = sAttr, sigAlg = sigAlg, signerCert = signerCert, signerPrvKey = signerPrvKey)
  
    __obj.asInstanceOf[Anon_HashAlg]
  }
}

