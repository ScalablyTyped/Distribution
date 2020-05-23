package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashMsgHex extends js.Object {
  var hashAlg: String
  var hashMsgHex: String
}

object HashMsgHex {
  @scala.inline
  def apply(hashAlg: String, hashMsgHex: String): HashMsgHex = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashMsgHex = hashMsgHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashMsgHex]
  }
}

