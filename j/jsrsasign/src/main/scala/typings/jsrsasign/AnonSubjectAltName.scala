package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubjectAltName extends js.Object {
  var subjectAltName: ArrayParam[AnonDns]
}

object AnonSubjectAltName {
  @scala.inline
  def apply(subjectAltName: ArrayParam[AnonDns]): AnonSubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubjectAltName]
  }
}

