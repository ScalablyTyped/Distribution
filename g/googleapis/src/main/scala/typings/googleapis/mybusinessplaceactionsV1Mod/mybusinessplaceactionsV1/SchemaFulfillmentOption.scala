package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFulfillmentOption extends StObject {
  
  /**
    * A list of days on which there is availability for this fulfillment method (preferably at least 2).
    */
  var availableDay: js.UndefOr[js.Array[SchemaAvailableDay]] = js.undefined
  
  /**
    * Fee details for the fulfillment method.
    */
  var feeDetails: js.UndefOr[SchemaFeeDetails] = js.undefined
  
  /**
    * Fulfillment type
    */
  var fulfillmentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum order for the fulfillment method associated with the action.
    */
  var minimumOrder: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaFulfillmentOption {
  
  inline def apply(): SchemaFulfillmentOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFulfillmentOption]
  }
  
  extension [Self <: SchemaFulfillmentOption](x: Self) {
    
    inline def setAvailableDay(value: js.Array[SchemaAvailableDay]): Self = StObject.set(x, "availableDay", value.asInstanceOf[js.Any])
    
    inline def setAvailableDayUndefined: Self = StObject.set(x, "availableDay", js.undefined)
    
    inline def setAvailableDayVarargs(value: SchemaAvailableDay*): Self = StObject.set(x, "availableDay", js.Array(value*))
    
    inline def setFeeDetails(value: SchemaFeeDetails): Self = StObject.set(x, "feeDetails", value.asInstanceOf[js.Any])
    
    inline def setFeeDetailsUndefined: Self = StObject.set(x, "feeDetails", js.undefined)
    
    inline def setFulfillmentType(value: String): Self = StObject.set(x, "fulfillmentType", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentTypeNull: Self = StObject.set(x, "fulfillmentType", null)
    
    inline def setFulfillmentTypeUndefined: Self = StObject.set(x, "fulfillmentType", js.undefined)
    
    inline def setMinimumOrder(value: SchemaMoney): Self = StObject.set(x, "minimumOrder", value.asInstanceOf[js.Any])
    
    inline def setMinimumOrderUndefined: Self = StObject.set(x, "minimumOrder", js.undefined)
  }
}
