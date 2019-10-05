package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.Anon_HexName
import typings.jsrsasign.Anon_HexObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEMInfo extends js.Object {
  var pubkey: Anon_HexObj
  var subject: Anon_HexName
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: Anon_HexObj, subject: Anon_HexName): PEMInfo = {
    val __obj = js.Dynamic.literal(pubkey = pubkey, subject = subject)
  
    __obj.asInstanceOf[PEMInfo]
  }
}

