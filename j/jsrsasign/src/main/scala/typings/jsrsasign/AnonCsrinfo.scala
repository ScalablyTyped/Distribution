package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCsrinfo extends js.Object {
  var csrinfo: CertificationRequestInfo
}

object AnonCsrinfo {
  @scala.inline
  def apply(csrinfo: CertificationRequestInfo): AnonCsrinfo = {
    val __obj = js.Dynamic.literal(csrinfo = csrinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCsrinfo]
  }
}

