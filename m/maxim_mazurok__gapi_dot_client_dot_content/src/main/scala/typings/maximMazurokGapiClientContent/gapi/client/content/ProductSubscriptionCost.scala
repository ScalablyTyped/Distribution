package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSubscriptionCost extends js.Object {
  
  /** The amount the buyer has to pay per subscription period. */
  var amount: js.UndefOr[Price] = js.native
  
  /** The type of subscription period. */
  var period: js.UndefOr[String] = js.native
  
  /** The number of subscription periods the buyer has to pay. */
  var periodLength: js.UndefOr[String] = js.native
}
object ProductSubscriptionCost {
  
  @scala.inline
  def apply(): ProductSubscriptionCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSubscriptionCost]
  }
  
  @scala.inline
  implicit class ProductSubscriptionCostOps[Self <: ProductSubscriptionCost] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Price): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPeriodLength(value: String): Self = this.set("periodLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodLength: Self = this.set("periodLength", js.undefined)
  }
}
