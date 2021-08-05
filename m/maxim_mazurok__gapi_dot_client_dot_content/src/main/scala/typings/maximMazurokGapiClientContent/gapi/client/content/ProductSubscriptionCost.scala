package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSubscriptionCost extends StObject {
  
  /** The amount the buyer has to pay per subscription period. */
  var amount: js.UndefOr[Price] = js.undefined
  
  /** The type of subscription period. */
  var period: js.UndefOr[String] = js.undefined
  
  /** The number of subscription periods the buyer has to pay. */
  var periodLength: js.UndefOr[String] = js.undefined
}
object ProductSubscriptionCost {
  
  inline def apply(): ProductSubscriptionCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSubscriptionCost]
  }
  
  extension [Self <: ProductSubscriptionCost](x: Self) {
    
    inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodLength(value: String): Self = StObject.set(x, "periodLength", value.asInstanceOf[js.Any])
    
    inline def setPeriodLengthUndefined: Self = StObject.set(x, "periodLength", js.undefined)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
