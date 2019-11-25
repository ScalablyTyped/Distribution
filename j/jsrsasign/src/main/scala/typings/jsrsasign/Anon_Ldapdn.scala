package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ldapdn extends GeneralNameParam {
  var ldapdn: String
}

object Anon_Ldapdn {
  @scala.inline
  def apply(ldapdn: String): Anon_Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ldapdn]
  }
}

