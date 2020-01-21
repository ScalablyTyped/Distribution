package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.AnonHexName
import typings.jsrsasign.AnonHexObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEMInfo extends js.Object {
  var pubkey: AnonHexObj
  var subject: AnonHexName
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: AnonHexObj, subject: AnonHexName): PEMInfo = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PEMInfo]
  }
}

