package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashAlgHashMsgHex extends js.Object {
  var hashAlg: String
  var hashMsgHex: String
}

object AnonHashAlgHashMsgHex {
  @scala.inline
  def apply(hashAlg: String, hashMsgHex: String): AnonHashAlgHashMsgHex = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashMsgHex = hashMsgHex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashAlgHashMsgHex]
  }
}

