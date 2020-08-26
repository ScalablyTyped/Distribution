package typings.libraCore.eventsPbMod.EventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var event: js.UndefOr[typings.libraCore.eventsPbMod.Event.AsObject] = js.native
  var eventIndex: String = js.native
  var proof: js.UndefOr[typings.libraCore.proofPbMod.EventProof.AsObject] = js.native
  var transactionVersion: String = js.native
}

object AsObject {
  @scala.inline
  def apply(eventIndex: String, transactionVersion: String): AsObject = {
    val __obj = js.Dynamic.literal(eventIndex = eventIndex.asInstanceOf[js.Any], transactionVersion = transactionVersion.asInstanceOf[js.Any])
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
    def setEventIndex(value: String): Self = this.set("eventIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionVersion(value: String): Self = this.set("transactionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: typings.libraCore.eventsPbMod.Event.AsObject): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setProof(value: typings.libraCore.proofPbMod.EventProof.AsObject): Self = this.set("proof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProof: Self = this.set("proof", js.undefined)
  }
  
}

