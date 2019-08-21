package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Status extends js.Object {
  var status: Anon_Failinfo
  var tst: ASN1Object
}

object Anon_Status {
  @scala.inline
  def apply(status: Anon_Failinfo, tst: ASN1Object): Anon_Status = {
    val __obj = js.Dynamic.literal(status = status, tst = tst)
  
    __obj.asInstanceOf[Anon_Status]
  }
}

