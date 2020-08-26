package typings.libraCore.transactionPbMod.SignedTransaction

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var rawTxnBytes: Uint8Array | String = js.native
  var senderPublicKey: Uint8Array | String = js.native
  var senderSignature: Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(
    rawTxnBytes: Uint8Array | String,
    senderPublicKey: Uint8Array | String,
    senderSignature: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setRawTxnBytes(value: Uint8Array | String): Self = this.set("rawTxnBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenderPublicKey(value: Uint8Array | String): Self = this.set("senderPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenderSignature(value: Uint8Array | String): Self = this.set("senderSignature", value.asInstanceOf[js.Any])
  }
  
}

