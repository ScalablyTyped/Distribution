package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUriString extends GeneralNameParam {
  var uri: String
}

object AnonUriString {
  @scala.inline
  def apply(uri: String): AnonUriString = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUriString]
  }
}

