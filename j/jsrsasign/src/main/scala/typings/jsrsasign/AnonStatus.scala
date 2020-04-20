package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatus extends js.Object {
  var status: AnonFailinfo
  var tst: ASN1Object
}

object AnonStatus {
  @scala.inline
  def apply(status: AnonFailinfo, tst: ASN1Object): AnonStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
}

