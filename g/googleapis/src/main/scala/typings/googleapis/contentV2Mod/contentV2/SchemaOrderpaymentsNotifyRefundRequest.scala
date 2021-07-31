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
  
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyRefundRequest]
  }
  
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyRefundRequestMutableBuilder[Self <: SchemaOrderpaymentsNotifyRefundRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    @scala.inline
    def setInvoiceIds(value: js.Array[String]): Self = StObject.set(x, "invoiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdsUndefined: Self = StObject.set(x, "invoiceIds", js.undefined)
    
    @scala.inline
    def setInvoiceIdsVarargs(value: String*): Self = StObject.set(x, "invoiceIds", js.Array(value :_*))
    
    @scala.inline
    def setRefundState(value: String): Self = StObject.set(x, "refundState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundStateUndefined: Self = StObject.set(x, "refundState", js.undefined)
  }
}
