package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Csrinfo extends js.Object {
  var csrinfo: CertificationRequestInfo
}

object Csrinfo {
  @scala.inline
  def apply(csrinfo: CertificationRequestInfo): Csrinfo = {
    val __obj = js.Dynamic.literal(csrinfo = csrinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csrinfo]
  }
}

