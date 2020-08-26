package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashMsgHex extends js.Object {
  var hashAlg: String = js.native
  var hashMsgHex: String = js.native
}

object HashMsgHex {
  @scala.inline
  def apply(hashAlg: String, hashMsgHex: String): HashMsgHex = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashMsgHex = hashMsgHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashMsgHex]
  }
  @scala.inline
  implicit class HashMsgHexOps[Self <: HashMsgHex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashMsgHex(value: String): Self = this.set("hashMsgHex", value.asInstanceOf[js.Any])
  }
  
}

