package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPolicyPolicy extends StObject {
  
  /**
    * Required. Last day for returning the items. In ISO 8601 format. When specifying the return window like this, set the policy type to "lastReturnDate". Use this for seasonal overrides only.
    */
  var lastReturnDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of days items can be returned after delivery, where one day is defined to be 24 hours after the delivery timestamp. When specifying the return window like this, set the policy type to "numberOfDaysAfterDelivery". Acceptable values are 30, 45, 60, 90, 100, 180, 270 and 365 for the default policy. Additional policies further allow 14, 15, 21 and 28 days, but note that for most items a minimum of 30 days is required for returns. Exceptions may be made for electronics. A policy of less than 30 days can only be applied to those items.
    */
  var numberOfDays: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Policy type. Use "lastReturnDate" for seasonal overrides only. Note that for most items a minimum of 30 days is required for returns. Exceptions may be made for electronics or non-returnable items such as food, perishables, and living things. A policy of less than 30 days can only be applied to those items. Acceptable values are: - "`lastReturnDate`" - "`lifetimeReturns`" - "`noReturns`" - "`numberOfDaysAfterDelivery`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnPolicyPolicy {
  
  inline def apply(): SchemaReturnPolicyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPolicyPolicy]
  }
  
  extension [Self <: SchemaReturnPolicyPolicy](x: Self) {
    
    inline def setLastReturnDate(value: String): Self = StObject.set(x, "lastReturnDate", value.asInstanceOf[js.Any])
    
    inline def setLastReturnDateNull: Self = StObject.set(x, "lastReturnDate", null)
    
    inline def setLastReturnDateUndefined: Self = StObject.set(x, "lastReturnDate", js.undefined)
    
    inline def setNumberOfDays(value: String): Self = StObject.set(x, "numberOfDays", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDaysNull: Self = StObject.set(x, "numberOfDays", null)
    
    inline def setNumberOfDaysUndefined: Self = StObject.set(x, "numberOfDays", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
