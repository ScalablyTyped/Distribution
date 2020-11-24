package typings.libraCore.transactionPbMod.TransactionToCommit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var accountStatesList: js.Array[typings.libraCore.transactionPbMod.AccountState.AsObject] = js.native
  
  var eventsList: js.Array[typings.libraCore.eventsPbMod.Event.AsObject] = js.native
  
  var gasUsed: String = js.native
  
  var signedTxn: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    accountStatesList: js.Array[typings.libraCore.transactionPbMod.AccountState.AsObject],
    eventsList: js.Array[typings.libraCore.eventsPbMod.Event.AsObject],
    gasUsed: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
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
    def setAccountStatesListVarargs(value: typings.libraCore.transactionPbMod.AccountState.AsObject*): Self = this.set("accountStatesList", js.Array(value :_*))
    
    @scala.inline
    def setAccountStatesList(value: js.Array[typings.libraCore.transactionPbMod.AccountState.AsObject]): Self = this.set("accountStatesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsListVarargs(value: typings.libraCore.eventsPbMod.Event.AsObject*): Self = this.set("eventsList", js.Array(value :_*))
    
    @scala.inline
    def setEventsList(value: js.Array[typings.libraCore.eventsPbMod.Event.AsObject]): Self = this.set("eventsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: String): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedTxn(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = this.set("signedTxn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedTxn: Self = this.set("signedTxn", js.undefined)
  }
}
