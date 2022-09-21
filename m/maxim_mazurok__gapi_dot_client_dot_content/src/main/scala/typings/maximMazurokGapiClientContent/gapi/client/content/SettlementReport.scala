package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementReport extends StObject {
  
  /** The end date on which all transactions are included in the report, in ISO 8601 format. */
  var endDate: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#settlementReport`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The residual amount from the previous invoice. This is set only if the previous invoices are not paid because of negative balance. */
  var previousBalance: js.UndefOr[Price] = js.undefined
  
  /** The ID of the settlement report. */
  var settlementId: js.UndefOr[String] = js.undefined
  
  /** The start date on which all transactions are included in the report, in ISO 8601 format. */
  var startDate: js.UndefOr[String] = js.undefined
  
  /** The money due to the merchant. */
  var transferAmount: js.UndefOr[Price] = js.undefined
  
  /** Date on which transfer for this payment was initiated by Google, in ISO 8601 format. */
  var transferDate: js.UndefOr[String] = js.undefined
  
  /** The list of bank identifiers used for the transfer. For example, Trace ID for Federal Automated Clearing House (ACH). This may also be known as the Wire ID. */
  var transferIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SettlementReport {
  
  inline def apply(): SettlementReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementReport]
  }
  
  extension [Self <: SettlementReport](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPreviousBalance(value: Price): Self = StObject.set(x, "previousBalance", value.asInstanceOf[js.Any])
    
    inline def setPreviousBalanceUndefined: Self = StObject.set(x, "previousBalance", js.undefined)
    
    inline def setSettlementId(value: String): Self = StObject.set(x, "settlementId", value.asInstanceOf[js.Any])
    
    inline def setSettlementIdUndefined: Self = StObject.set(x, "settlementId", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTransferAmount(value: Price): Self = StObject.set(x, "transferAmount", value.asInstanceOf[js.Any])
    
    inline def setTransferAmountUndefined: Self = StObject.set(x, "transferAmount", js.undefined)
    
    inline def setTransferDate(value: String): Self = StObject.set(x, "transferDate", value.asInstanceOf[js.Any])
    
    inline def setTransferDateUndefined: Self = StObject.set(x, "transferDate", js.undefined)
    
    inline def setTransferIds(value: js.Array[String]): Self = StObject.set(x, "transferIds", value.asInstanceOf[js.Any])
    
    inline def setTransferIdsUndefined: Self = StObject.set(x, "transferIds", js.undefined)
    
    inline def setTransferIdsVarargs(value: String*): Self = StObject.set(x, "transferIds", js.Array(value*))
  }
}
