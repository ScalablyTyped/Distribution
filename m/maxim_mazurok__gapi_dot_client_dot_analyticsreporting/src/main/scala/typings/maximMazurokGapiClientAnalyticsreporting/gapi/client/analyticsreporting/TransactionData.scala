package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionData extends js.Object {
  
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
  implicit class TransactionDataOps[Self <: TransactionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
    
    @scala.inline
    def setTransactionRevenue(value: Double): Self = this.set("transactionRevenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionRevenue: Self = this.set("transactionRevenue", js.undefined)
    
    @scala.inline
    def setTransactionShipping(value: Double): Self = this.set("transactionShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionShipping: Self = this.set("transactionShipping", js.undefined)
    
    @scala.inline
    def setTransactionTax(value: Double): Self = this.set("transactionTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionTax: Self = this.set("transactionTax", js.undefined)
  }
}
