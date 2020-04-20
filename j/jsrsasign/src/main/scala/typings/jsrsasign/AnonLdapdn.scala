package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLdapdn extends GeneralNameParam {
  var ldapdn: String
}

object AnonLdapdn {
  @scala.inline
  def apply(ldapdn: String): AnonLdapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLdapdn]
  }
}

