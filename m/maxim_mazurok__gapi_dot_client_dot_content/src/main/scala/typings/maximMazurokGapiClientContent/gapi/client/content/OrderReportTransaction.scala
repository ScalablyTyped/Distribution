package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderReportTransaction extends StObject {
  
  /** The disbursement amount. */
  var disbursementAmount: js.UndefOr[Price] = js.undefined
  
  /** The date the disbursement was created, in ISO 8601 format. */
  var disbursementCreationDate: js.UndefOr[String] = js.undefined
  
  /** The date the disbursement was initiated, in ISO 8601 format. */
  var disbursementDate: js.UndefOr[String] = js.undefined
  
  /** The ID of the disbursement. */
  var disbursementId: js.UndefOr[String] = js.undefined
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** Merchant-provided ID of the order. */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  /** The ID of the order. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** Total amount for the items. */
  var productAmount: js.UndefOr[ProductAmount] = js.undefined
  
  /** The date of the transaction, in ISO 8601 format. */
  var transactionDate: js.UndefOr[String] = js.undefined
}
object OrderReportTransaction {
  
  @scala.inline
  def apply(): OrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderReportTransaction]
  }
  
  @scala.inline
  implicit class OrderReportTransactionMutableBuilder[Self <: OrderReportTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisbursementAmount(value: Price): Self = StObject.set(x, "disbursementAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementAmountUndefined: Self = StObject.set(x, "disbursementAmount", js.undefined)
    
    @scala.inline
    def setDisbursementCreationDate(value: String): Self = StObject.set(x, "disbursementCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementCreationDateUndefined: Self = StObject.set(x, "disbursementCreationDate", js.undefined)
    
    @scala.inline
    def setDisbursementDate(value: String): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementDateUndefined: Self = StObject.set(x, "disbursementDate", js.undefined)
    
    @scala.inline
    def setDisbursementId(value: String): Self = StObject.set(x, "disbursementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementIdUndefined: Self = StObject.set(x, "disbursementId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setProductAmount(value: ProductAmount): Self = StObject.set(x, "productAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductAmountUndefined: Self = StObject.set(x, "productAmount", js.undefined)
    
    @scala.inline
    def setTransactionDate(value: String): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionDateUndefined: Self = StObject.set(x, "transactionDate", js.undefined)
  }
}
