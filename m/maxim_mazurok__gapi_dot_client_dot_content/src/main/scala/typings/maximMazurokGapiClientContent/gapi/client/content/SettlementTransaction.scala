package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementTransaction extends StObject {
  
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
  implicit class SettlementTransactionMutableBuilder[Self <: SettlementTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SettlementTransactionAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setIdentifiers(value: SettlementTransactionIdentifiers): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTransaction(value: SettlementTransactionTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
