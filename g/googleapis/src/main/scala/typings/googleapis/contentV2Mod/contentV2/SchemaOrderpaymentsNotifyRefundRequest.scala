package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderpaymentsNotifyRefundRequest extends StObject {
  
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  /**
    * Invoice IDs from the orderinvoices service that correspond to the refund.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether refund was successful.
    */
  var refundState: js.UndefOr[String] = js.undefined
}
object SchemaOrderpaymentsNotifyRefundRequest {
  
  inline def apply(): SchemaOrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyRefundRequest]
  }
  
  extension [Self <: SchemaOrderpaymentsNotifyRefundRequest](x: Self) {
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setInvoiceIds(value: js.Array[String]): Self = StObject.set(x, "invoiceIds", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdsUndefined: Self = StObject.set(x, "invoiceIds", js.undefined)
    
    inline def setInvoiceIdsVarargs(value: String*): Self = StObject.set(x, "invoiceIds", js.Array(value :_*))
    
    inline def setRefundState(value: String): Self = StObject.set(x, "refundState", value.asInstanceOf[js.Any])
    
    inline def setRefundStateUndefined: Self = StObject.set(x, "refundState", js.undefined)
  }
}
