package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementTransaction extends js.Object {
  
  /** The amount for the transaction. */
  var amount: js.UndefOr[SettlementTransactionAmount] = js.native
  
  /** Identifiers of the transaction. */
  var identifiers: js.UndefOr[SettlementTransactionIdentifiers] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#settlementTransaction`" */
  var kind: js.UndefOr[String] = js.native
  
  /** Details of the transaction. */
  var transaction: js.UndefOr[SettlementTransactionTransaction] = js.native
}
object SettlementTransaction {
  
  @scala.inline
  def apply(): SettlementTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransaction]
  }
  
  @scala.inline
  implicit class SettlementTransactionOps[Self <: SettlementTransaction] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: SettlementTransactionAmount): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setIdentifiers(value: SettlementTransactionIdentifiers): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifiers: Self = this.set("identifiers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setTransaction(value: SettlementTransactionTransaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
