package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionData extends StObject {
  
  /** The transaction ID, supplied by the e-commerce tracking method, for the purchase in the shopping cart. */
  var transactionId: js.UndefOr[String] = js.native
  
  /** The total sale revenue (excluding shipping and tax) of the transaction. */
  var transactionRevenue: js.UndefOr[Double] = js.native
  
  /** Total cost of shipping. */
  var transactionShipping: js.UndefOr[Double] = js.native
  
  /** Total tax for the transaction. */
  var transactionTax: js.UndefOr[Double] = js.native
}
object TransactionData {
  
  @scala.inline
  def apply(): TransactionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionData]
  }
  
  @scala.inline
  implicit class TransactionDataMutableBuilder[Self <: TransactionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    @scala.inline
    def setTransactionRevenue(value: Double): Self = StObject.set(x, "transactionRevenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionRevenueUndefined: Self = StObject.set(x, "transactionRevenue", js.undefined)
    
    @scala.inline
    def setTransactionShipping(value: Double): Self = StObject.set(x, "transactionShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionShippingUndefined: Self = StObject.set(x, "transactionShipping", js.undefined)
    
    @scala.inline
    def setTransactionTax(value: Double): Self = StObject.set(x, "transactionTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionTaxUndefined: Self = StObject.set(x, "transactionTax", js.undefined)
  }
}
