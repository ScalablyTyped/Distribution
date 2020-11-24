package typings.libraCore.getWithProofPbMod.RequestItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var getAccountStateRequest: js.UndefOr[typings.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject] = js.native
  
  var getAccountTransactionBySequenceNumberRequest: js.UndefOr[
    typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
  ] = js.native
  
  var getEventsByEventAccessPathRequest: js.UndefOr[typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject] = js.native
  
  var getTransactionsRequest: js.UndefOr[typings.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject] = js.native
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
    def setGetAccountStateRequest(value: typings.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject): Self = this.set("getAccountStateRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAccountStateRequest: Self = this.set("getAccountStateRequest", js.undefined)
    
    @scala.inline
    def setGetAccountTransactionBySequenceNumberRequest(value: typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject): Self = this.set("getAccountTransactionBySequenceNumberRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAccountTransactionBySequenceNumberRequest: Self = this.set("getAccountTransactionBySequenceNumberRequest", js.undefined)
    
    @scala.inline
    def setGetEventsByEventAccessPathRequest(value: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject): Self = this.set("getEventsByEventAccessPathRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetEventsByEventAccessPathRequest: Self = this.set("getEventsByEventAccessPathRequest", js.undefined)
    
    @scala.inline
    def setGetTransactionsRequest(value: typings.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject): Self = this.set("getTransactionsRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetTransactionsRequest: Self = this.set("getTransactionsRequest", js.undefined)
  }
}
