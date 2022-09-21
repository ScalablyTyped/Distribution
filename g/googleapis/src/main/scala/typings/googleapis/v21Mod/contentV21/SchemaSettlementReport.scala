package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettlementReport extends StObject {
  
  /**
    * The end date on which all transactions are included in the report, in ISO 8601 format.
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#settlementReport`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The residual amount from the previous invoice. This is set only if the previous invoices are not paid because of negative balance.
    */
  var previousBalance: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The ID of the settlement report.
    */
  var settlementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start date on which all transactions are included in the report, in ISO 8601 format.
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The money due to the merchant.
    */
  var transferAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Date on which transfer for this payment was initiated by Google, in ISO 8601 format.
    */
  var transferDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of bank identifiers used for the transfer. For example, Trace ID for Federal Automated Clearing House (ACH). This may also be known as the Wire ID.
    */
  var transferIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSettlementReport {
  
  inline def apply(): SchemaSettlementReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettlementReport]
  }
  
  extension [Self <: SchemaSettlementReport](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPreviousBalance(value: SchemaPrice): Self = StObject.set(x, "previousBalance", value.asInstanceOf[js.Any])
    
    inline def setPreviousBalanceUndefined: Self = StObject.set(x, "previousBalance", js.undefined)
    
    inline def setSettlementId(value: String): Self = StObject.set(x, "settlementId", value.asInstanceOf[js.Any])
    
    inline def setSettlementIdNull: Self = StObject.set(x, "settlementId", null)
    
    inline def setSettlementIdUndefined: Self = StObject.set(x, "settlementId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTransferAmount(value: SchemaPrice): Self = StObject.set(x, "transferAmount", value.asInstanceOf[js.Any])
    
    inline def setTransferAmountUndefined: Self = StObject.set(x, "transferAmount", js.undefined)
    
    inline def setTransferDate(value: String): Self = StObject.set(x, "transferDate", value.asInstanceOf[js.Any])
    
    inline def setTransferDateNull: Self = StObject.set(x, "transferDate", null)
    
    inline def setTransferDateUndefined: Self = StObject.set(x, "transferDate", js.undefined)
    
    inline def setTransferIds(value: js.Array[String]): Self = StObject.set(x, "transferIds", value.asInstanceOf[js.Any])
    
    inline def setTransferIdsNull: Self = StObject.set(x, "transferIds", null)
    
    inline def setTransferIdsUndefined: Self = StObject.set(x, "transferIds", js.undefined)
    
    inline def setTransferIdsVarargs(value: String*): Self = StObject.set(x, "transferIds", js.Array(value*))
  }
}
