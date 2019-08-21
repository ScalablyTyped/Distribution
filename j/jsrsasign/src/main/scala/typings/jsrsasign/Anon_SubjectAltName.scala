package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubjectAltName extends js.Object {
  var subjectAltName: ArrayParam[Anon_Dns]
}

object Anon_SubjectAltName {
  @scala.inline
  def apply(subjectAltName: ArrayParam[Anon_Dns]): Anon_SubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName)
  
    __obj.asInstanceOf[Anon_SubjectAltName]
  }
}

