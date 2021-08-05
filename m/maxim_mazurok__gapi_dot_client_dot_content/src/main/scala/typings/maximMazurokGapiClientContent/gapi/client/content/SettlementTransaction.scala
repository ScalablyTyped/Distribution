package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementTransaction extends StObject {
  
  /** The amount for the transaction. */
  var amount: js.UndefOr[SettlementTransactionAmount] = js.undefined
  
  /** Identifiers of the transaction. */
  var identifiers: js.UndefOr[SettlementTransactionIdentifiers] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#settlementTransaction`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Details of the transaction. */
  var transaction: js.UndefOr[SettlementTransactionTransaction] = js.undefined
}
object SettlementTransaction {
  
  inline def apply(): SettlementTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransaction]
  }
  
  extension [Self <: SettlementTransaction](x: Self) {
    
    inline def setAmount(value: SettlementTransactionAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setIdentifiers(value: SettlementTransactionIdentifiers): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTransaction(value: SettlementTransactionTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
