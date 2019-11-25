package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Uri extends GeneralNameParam {
  var uri: String
}

object Anon_Uri {
  @scala.inline
  def apply(uri: String): Anon_Uri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Uri]
  }
}

