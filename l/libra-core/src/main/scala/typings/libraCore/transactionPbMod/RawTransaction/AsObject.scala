package typings.libraCore.transactionPbMod.RawTransaction

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var expirationTime: String = js.native
  
  var gasUnitPrice: String = js.native
  
  var maxGasAmount: String = js.native
  
  var program: js.UndefOr[typings.libraCore.transactionPbMod.Program.AsObject] = js.native
  
  var senderAccount: Uint8Array | String = js.native
  
  var sequenceNumber: String = js.native
  
  var writeSet: js.UndefOr[typings.libraCore.transactionPbMod.WriteSet.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    expirationTime: String,
    gasUnitPrice: String,
    maxGasAmount: String,
    senderAccount: Uint8Array | String,
    sequenceNumber: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], gasUnitPrice = gasUnitPrice.asInstanceOf[js.Any], maxGasAmount = maxGasAmount.asInstanceOf[js.Any], senderAccount = senderAccount.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
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
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUnitPrice(value: String): Self = this.set("gasUnitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxGasAmount(value: String): Self = this.set("maxGasAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderAccount(value: Uint8Array | String): Self = this.set("senderAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: typings.libraCore.transactionPbMod.Program.AsObject): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setWriteSet(value: typings.libraCore.transactionPbMod.WriteSet.AsObject): Self = this.set("writeSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteSet: Self = this.set("writeSet", js.undefined)
  }
}
