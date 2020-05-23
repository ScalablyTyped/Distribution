package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubjectAltName extends js.Object {
  var subjectAltName: ArrayParam[Dns]
}

object SubjectAltName {
  @scala.inline
  def apply(subjectAltName: ArrayParam[Dns]): SubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAltName]
  }
}

