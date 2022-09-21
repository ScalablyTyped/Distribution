package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAvailableDay extends StObject {
  
  /**
    * An available date for a fulfillment method. Assumed to be in merchant's timezone.
    */
  var fulfillmentDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Unix timestamp. The last time till when, a user could place an order to be received by `fulfillment_date`. In other words, after last_ordering_time, fulfillment_date will no longer be shown as available.
    */
  var lastOrderingTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaAvailableDay {
  
  inline def apply(): SchemaAvailableDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAvailableDay]
  }
  
  extension [Self <: SchemaAvailableDay](x: Self) {
    
    inline def setFulfillmentDate(value: SchemaDate): Self = StObject.set(x, "fulfillmentDate", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentDateUndefined: Self = StObject.set(x, "fulfillmentDate", js.undefined)
    
    inline def setLastOrderingTime(value: String): Self = StObject.set(x, "lastOrderingTime", value.asInstanceOf[js.Any])
    
    inline def setLastOrderingTimeNull: Self = StObject.set(x, "lastOrderingTime", null)
    
    inline def setLastOrderingTimeUndefined: Self = StObject.set(x, "lastOrderingTime", js.undefined)
  }
}
