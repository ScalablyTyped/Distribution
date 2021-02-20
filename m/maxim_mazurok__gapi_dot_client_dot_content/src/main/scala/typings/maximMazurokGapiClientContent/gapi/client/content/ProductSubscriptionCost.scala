package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSubscriptionCost extends StObject {
  
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
  implicit class ProductSubscriptionCostMutableBuilder[Self <: ProductSubscriptionCost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodLength(value: String): Self = StObject.set(x, "periodLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodLengthUndefined: Self = StObject.set(x, "periodLength", js.undefined)
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
