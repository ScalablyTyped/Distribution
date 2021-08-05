package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderReportTransaction extends StObject {
  
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The date the disbursement was created, in ISO 8601 format.
    */
  var disbursementCreationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date the disbursement was initiated, in ISO 8601 format.
    */
  var disbursementDate: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the disbursement.
    */
  var disbursementId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Merchant-provided ID of the order.
    */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the order.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * Total amount for the items.
    */
  var productAmount: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * Total amount with remitted tax for the items.
    */
  var productAmountWithRemittedTax: js.UndefOr[SchemaProductAmount] = js.undefined
  
  /**
    * The date of the transaction, in ISO 8601 format.
    */
  var transactionDate: js.UndefOr[String] = js.undefined
}
object SchemaOrderReportTransaction {
  
  inline def apply(): SchemaOrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReportTransaction]
  }
  
  extension [Self <: SchemaOrderReportTransaction](x: Self) {
    
    inline def setDisbursementAmount(value: SchemaPrice): Self = StObject.set(x, "disbursementAmount", value.asInstanceOf[js.Any])
    
    inline def setDisbursementAmountUndefined: Self = StObject.set(x, "disbursementAmount", js.undefined)
    
    inline def setDisbursementCreationDate(value: String): Self = StObject.set(x, "disbursementCreationDate", value.asInstanceOf[js.Any])
    
    inline def setDisbursementCreationDateUndefined: Self = StObject.set(x, "disbursementCreationDate", js.undefined)
    
    inline def setDisbursementDate(value: String): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    inline def setDisbursementDateUndefined: Self = StObject.set(x, "disbursementDate", js.undefined)
    
    inline def setDisbursementId(value: String): Self = StObject.set(x, "disbursementId", value.asInstanceOf[js.Any])
    
    inline def setDisbursementIdUndefined: Self = StObject.set(x, "disbursementId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    inline def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setProductAmount(value: SchemaAmount): Self = StObject.set(x, "productAmount", value.asInstanceOf[js.Any])
    
    inline def setProductAmountUndefined: Self = StObject.set(x, "productAmount", js.undefined)
    
    inline def setProductAmountWithRemittedTax(value: SchemaProductAmount): Self = StObject.set(x, "productAmountWithRemittedTax", value.asInstanceOf[js.Any])
    
    inline def setProductAmountWithRemittedTaxUndefined: Self = StObject.set(x, "productAmountWithRemittedTax", js.undefined)
    
    inline def setTransactionDate(value: String): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
    
    inline def setTransactionDateUndefined: Self = StObject.set(x, "transactionDate", js.undefined)
  }
}
