package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Certsubj extends GeneralNameParam {
  var certsubj: String
}

object Anon_Certsubj {
  @scala.inline
  def apply(certsubj: String): Anon_Certsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Certsubj]
  }
}

