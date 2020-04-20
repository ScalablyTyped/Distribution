package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateRequestList extends js.Object {
  var reqList: js.Array[CertificateRequest]
}

object CertificateRequestList {
  @scala.inline
  def apply(reqList: js.Array[CertificateRequest]): CertificateRequestList = {
    val __obj = js.Dynamic.literal(reqList = reqList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequestList]
  }
}

