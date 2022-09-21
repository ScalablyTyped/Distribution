package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAudienceEventTrigger extends StObject {
  
  /** Required. The event name that will be logged. */
  var eventName: js.UndefOr[String] = js.undefined
  
  /** Required. When to log the event. */
  var logCondition: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAudienceEventTrigger {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAudienceEventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAudienceEventTrigger]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAudienceEventTrigger](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setLogCondition(value: String): Self = StObject.set(x, "logCondition", value.asInstanceOf[js.Any])
    
    inline def setLogConditionUndefined: Self = StObject.set(x, "logCondition", js.undefined)
  }
}
