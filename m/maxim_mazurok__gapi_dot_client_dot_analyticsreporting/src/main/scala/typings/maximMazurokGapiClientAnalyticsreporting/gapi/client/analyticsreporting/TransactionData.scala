package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionData extends StObject {
  
  /** The transaction ID, supplied by the e-commerce tracking method, for the purchase in the shopping cart. */
  var transactionId: js.UndefOr[String] = js.undefined
  
  /** The total sale revenue (excluding shipping and tax) of the transaction. */
  var transactionRevenue: js.UndefOr[Double] = js.undefined
  
  /** Total cost of shipping. */
  var transactionShipping: js.UndefOr[Double] = js.undefined
  
  /** Total tax for the transaction. */
  var transactionTax: js.UndefOr[Double] = js.undefined
}
object TransactionData {
  
  inline def apply(): TransactionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionData] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    inline def setTransactionRevenue(value: Double): Self = StObject.set(x, "transactionRevenue", value.asInstanceOf[js.Any])
    
    inline def setTransactionRevenueUndefined: Self = StObject.set(x, "transactionRevenue", js.undefined)
    
    inline def setTransactionShipping(value: Double): Self = StObject.set(x, "transactionShipping", value.asInstanceOf[js.Any])
    
    inline def setTransactionShippingUndefined: Self = StObject.set(x, "transactionShipping", js.undefined)
    
    inline def setTransactionTax(value: Double): Self = StObject.set(x, "transactionTax", value.asInstanceOf[js.Any])
    
    inline def setTransactionTaxUndefined: Self = StObject.set(x, "transactionTax", js.undefined)
  }
}
