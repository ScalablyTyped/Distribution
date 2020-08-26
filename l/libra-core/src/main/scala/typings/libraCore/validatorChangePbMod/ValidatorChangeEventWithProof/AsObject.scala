package typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var eventWithProof: js.UndefOr[typings.libraCore.eventsPbMod.EventWithProof.AsObject] = js.native
  var ledgerInfoWithSigs: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
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
    def setEventWithProof(value: typings.libraCore.eventsPbMod.EventWithProof.AsObject): Self = this.set("eventWithProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventWithProof: Self = this.set("eventWithProof", js.undefined)
    @scala.inline
    def setLedgerInfoWithSigs(value: typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject): Self = this.set("ledgerInfoWithSigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLedgerInfoWithSigs: Self = this.set("ledgerInfoWithSigs", js.undefined)
  }
  
}

