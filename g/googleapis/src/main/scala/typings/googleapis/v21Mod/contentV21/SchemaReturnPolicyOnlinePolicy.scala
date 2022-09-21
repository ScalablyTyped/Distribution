package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPolicyOnlinePolicy extends StObject {
  
  /**
    * The number of days items can be returned after delivery, where one day is defined to be 24 hours after the delivery timestamp. Required for `numberOfDaysAfterDelivery` returns.
    */
  var days: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Policy type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnPolicyOnlinePolicy {
  
  inline def apply(): SchemaReturnPolicyOnlinePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPolicyOnlinePolicy]
  }
  
  extension [Self <: SchemaReturnPolicyOnlinePolicy](x: Self) {
    
    inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysNull: Self = StObject.set(x, "days", null)
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
