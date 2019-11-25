package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dn extends GeneralNameParam {
  var dn: String
}

object Anon_Dn {
  @scala.inline
  def apply(dn: String): Anon_Dn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dn]
  }
}

