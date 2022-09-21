package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnPolicyOnlinePolicy extends StObject {
  
  /** The number of days items can be returned after delivery, where one day is defined to be 24 hours after the delivery timestamp. Required for `numberOfDaysAfterDelivery` returns. */
  var days: js.UndefOr[String] = js.undefined
  
  /** Policy type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ReturnPolicyOnlinePolicy {
  
  inline def apply(): ReturnPolicyOnlinePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicyOnlinePolicy]
  }
  
  extension [Self <: ReturnPolicyOnlinePolicy](x: Self) {
    
    inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
