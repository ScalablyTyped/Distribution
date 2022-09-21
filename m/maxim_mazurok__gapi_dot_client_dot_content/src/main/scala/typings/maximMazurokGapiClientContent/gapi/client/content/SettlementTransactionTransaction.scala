package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementTransactionTransaction extends StObject {
  
  /** The time on which the event occurred in ISO 8601 format. */
  var postDate: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the transaction that occurred. Acceptable values are: - "`order`" - "`reversal`" - "`orderRefund`" - "`reversalRefund`" - "`issueRelatedRefundAndReplacement`" -
    * "`returnLabelShippingFeeTransaction`" - "`reversalIssueRelatedRefundAndReplacement`" - "`reversalReturnLabelShippingFeeTransaction`" - "`lumpSumCorrectionTransaction`"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SettlementTransactionTransaction {
  
  inline def apply(): SettlementTransactionTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionTransaction]
  }
  
  extension [Self <: SettlementTransactionTransaction](x: Self) {
    
    inline def setPostDate(value: String): Self = StObject.set(x, "postDate", value.asInstanceOf[js.Any])
    
    inline def setPostDateUndefined: Self = StObject.set(x, "postDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
