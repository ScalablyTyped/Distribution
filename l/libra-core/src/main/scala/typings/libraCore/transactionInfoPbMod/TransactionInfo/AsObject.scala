package typings.libraCore.transactionInfoPbMod.TransactionInfo

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var eventRootHash: Uint8Array | String = js.native
  var gasUsed: String = js.native
  var signedTransactionHash: Uint8Array | String = js.native
  var stateRootHash: Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(
    eventRootHash: Uint8Array | String,
    gasUsed: String,
    signedTransactionHash: Uint8Array | String,
    stateRootHash: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
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
    def setEventRootHash(value: Uint8Array | String): Self = this.set("eventRootHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasUsed(value: String): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignedTransactionHash(value: Uint8Array | String): Self = this.set("signedTransactionHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateRootHash(value: Uint8Array | String): Self = this.set("stateRootHash", value.asInstanceOf[js.Any])
  }
  
}

