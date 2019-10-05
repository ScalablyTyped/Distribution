package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Certreq extends js.Object {
  var certreq: js.UndefOr[Boolean] = js.undefined
  var mi: MessageImprint
  var nonce: js.UndefOr[String] = js.undefined
  var policy: js.UndefOr[String] = js.undefined
}

object Anon_Certreq {
  @scala.inline
  def apply(
    mi: MessageImprint,
    certreq: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    policy: String = null
  ): Anon_Certreq = {
    val __obj = js.Dynamic.literal(mi = mi)
    if (!js.isUndefined(certreq)) __obj.updateDynamic("certreq")(certreq)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[Anon_Certreq]
  }
}

