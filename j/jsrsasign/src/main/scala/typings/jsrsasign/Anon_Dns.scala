package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dns extends GeneralNameParam {
  var dns: String
}

object Anon_Dns {
  @scala.inline
  def apply(dns: String): Anon_Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dns]
  }
}

