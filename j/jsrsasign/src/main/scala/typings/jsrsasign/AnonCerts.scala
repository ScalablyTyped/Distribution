package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCerts extends js.Object {
  var certs: js.Array[String]
  var content: StringParam
  var signerInfos: js.Array[AnonHashAlg]
}

object AnonCerts {
  @scala.inline
  def apply(certs: js.Array[String], content: StringParam, signerInfos: js.Array[AnonHashAlg]): AnonCerts = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCerts]
  }
}

