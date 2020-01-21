package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertreq extends js.Object {
  var certreq: js.UndefOr[Boolean] = js.undefined
  var mi: MessageImprint
  var nonce: js.UndefOr[String] = js.undefined
  var policy: js.UndefOr[String] = js.undefined
}

object AnonCertreq {
  @scala.inline
  def apply(
    mi: MessageImprint,
    certreq: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    policy: String = null
  ): AnonCertreq = {
    val __obj = js.Dynamic.literal(mi = mi.asInstanceOf[js.Any])
    if (!js.isUndefined(certreq)) __obj.updateDynamic("certreq")(certreq.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertreq]
  }
}

