package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettlementTransaction extends StObject {
  
  /**
    * The amount for the transaction.
    */
  var amount: js.UndefOr[SchemaSettlementTransactionAmount] = js.undefined
  
  /**
    * Identifiers of the transaction.
    */
  var identifiers: js.UndefOr[SchemaSettlementTransactionIdentifiers] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#settlementTransaction`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details of the transaction.
    */
  var transaction: js.UndefOr[SchemaSettlementTransactionTransaction] = js.undefined
}
object SchemaSettlementTransaction {
  
  inline def apply(): SchemaSettlementTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettlementTransaction]
  }
  
  extension [Self <: SchemaSettlementTransaction](x: Self) {
    
    inline def setAmount(value: SchemaSettlementTransactionAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setIdentifiers(value: SchemaSettlementTransactionIdentifiers): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTransaction(value: SchemaSettlementTransactionTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
