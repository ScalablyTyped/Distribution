package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.BigIntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.HexParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.IntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.NameParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ObjectIdentifierParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.tspNs.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertreqMi extends js.Object {
  var certreq: Boolean
  var mi: MessageImprint
  var nonce: IntegerParam | BigIntegerParam | HexParam | Double
  var policy: ObjectIdentifierParam | HexParam | NameParam
}

object Anon_CertreqMi {
  @scala.inline
  def apply(
    certreq: Boolean,
    mi: MessageImprint,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double,
    policy: ObjectIdentifierParam | HexParam | NameParam
  ): Anon_CertreqMi = {
    val __obj = js.Dynamic.literal(certreq = certreq, mi = mi, nonce = nonce.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CertreqMi]
  }
}

