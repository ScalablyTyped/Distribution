package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginTransactionRequest extends js.Object {
  
  /** Options for a new transaction. */
  var transactionOptions: js.UndefOr[TransactionOptions] = js.native
}
object BeginTransactionRequest {
  
  @scala.inline
  def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  @scala.inline
  implicit class BeginTransactionRequestOps[Self <: BeginTransactionRequest] (val x: Self) extends AnyVal {
    
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
    def setTransactionOptions(value: TransactionOptions): Self = this.set("transactionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionOptions: Self = this.set("transactionOptions", js.undefined)
  }
}
