package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDns extends GeneralNameParam {
  var dns: String
}

object AnonDns {
  @scala.inline
  def apply(dns: String): AnonDns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDns]
  }
}

