package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductSubscriptionCost extends StObject {
  
  /**
    * The amount the buyer has to pay per subscription period.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The type of subscription period.
    */
  var period: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of subscription periods the buyer has to pay.
    */
  var periodLength: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductSubscriptionCost {
  
  inline def apply(): SchemaProductSubscriptionCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSubscriptionCost]
  }
  
  extension [Self <: SchemaProductSubscriptionCost](x: Self) {
    
    inline def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodLength(value: String): Self = StObject.set(x, "periodLength", value.asInstanceOf[js.Any])
    
    inline def setPeriodLengthNull: Self = StObject.set(x, "periodLength", null)
    
    inline def setPeriodLengthUndefined: Self = StObject.set(x, "periodLength", js.undefined)
    
    inline def setPeriodNull: Self = StObject.set(x, "period", null)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
