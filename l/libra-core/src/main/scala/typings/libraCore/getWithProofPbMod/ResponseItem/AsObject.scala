package typings.libraCore.getWithProofPbMod.ResponseItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var getAccountStateResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject] = js.native
  
  var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
    typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
  ] = js.native
  
  var getEventsByEventAccessPathResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject] = js.native
  
  var getTransactionsResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject] = js.native
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
    def setGetAccountStateResponse(value: typings.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject): Self = this.set("getAccountStateResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAccountStateResponse: Self = this.set("getAccountStateResponse", js.undefined)
    
    @scala.inline
    def setGetAccountTransactionBySequenceNumberResponse(value: typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject): Self = this.set("getAccountTransactionBySequenceNumberResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAccountTransactionBySequenceNumberResponse: Self = this.set("getAccountTransactionBySequenceNumberResponse", js.undefined)
    
    @scala.inline
    def setGetEventsByEventAccessPathResponse(value: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject): Self = this.set("getEventsByEventAccessPathResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetEventsByEventAccessPathResponse: Self = this.set("getEventsByEventAccessPathResponse", js.undefined)
    
    @scala.inline
    def setGetTransactionsResponse(value: typings.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject): Self = this.set("getTransactionsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetTransactionsResponse: Self = this.set("getTransactionsResponse", js.undefined)
  }
}
