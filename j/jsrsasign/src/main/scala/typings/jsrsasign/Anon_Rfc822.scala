package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rfc822 extends GeneralNameParam {
  var rfc822: String
}

object Anon_Rfc822 {
  @scala.inline
  def apply(rfc822: String): Anon_Rfc822 = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rfc822]
  }
}

