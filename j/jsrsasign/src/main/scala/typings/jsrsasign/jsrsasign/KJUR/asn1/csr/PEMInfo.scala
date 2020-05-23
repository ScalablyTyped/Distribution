package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.anon.HexName
import typings.jsrsasign.anon.Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEMInfo extends js.Object {
  var pubkey: Obj
  var subject: HexName
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: Obj, subject: HexName): PEMInfo = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEMInfo]
  }
}

