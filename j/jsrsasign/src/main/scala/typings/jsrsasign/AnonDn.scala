package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDn extends GeneralNameParam {
  var dn: String
}

object AnonDn {
  @scala.inline
  def apply(dn: String): AnonDn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDn]
  }
}

