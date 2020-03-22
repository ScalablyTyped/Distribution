package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashMsgHex extends js.Object {
  var hashAlg: String
  var hashMsgHex: String
}

object AnonHashMsgHex {
  @scala.inline
  def apply(hashAlg: String, hashMsgHex: String): AnonHashMsgHex = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashMsgHex = hashMsgHex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashMsgHex]
  }
}

