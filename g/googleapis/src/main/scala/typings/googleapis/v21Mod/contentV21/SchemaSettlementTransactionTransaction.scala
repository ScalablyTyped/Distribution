package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettlementTransactionTransaction extends StObject {
  
  /**
    * The time on which the event occurred in ISO 8601 format.
    */
  var postDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the transaction that occurred. Acceptable values are: - "`order`" - "`reversal`" - "`orderRefund`" - "`reversalRefund`" - "`issueRelatedRefundAndReplacement`" - "`returnLabelShippingFeeTransaction`" - "`reversalIssueRelatedRefundAndReplacement`" - "`reversalReturnLabelShippingFeeTransaction`" - "`lumpSumCorrectionTransaction`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSettlementTransactionTransaction {
  
  inline def apply(): SchemaSettlementTransactionTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettlementTransactionTransaction]
  }
  
  extension [Self <: SchemaSettlementTransactionTransaction](x: Self) {
    
    inline def setPostDate(value: String): Self = StObject.set(x, "postDate", value.asInstanceOf[js.Any])
    
    inline def setPostDateNull: Self = StObject.set(x, "postDate", null)
    
    inline def setPostDateUndefined: Self = StObject.set(x, "postDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
