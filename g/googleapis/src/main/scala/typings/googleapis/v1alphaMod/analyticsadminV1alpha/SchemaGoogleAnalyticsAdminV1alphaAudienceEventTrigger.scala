package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceEventTrigger extends StObject {
  
  /**
    * Required. The event name that will be logged.
    */
  var eventName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. When to log the event.
    */
  var logCondition: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceEventTrigger {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceEventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceEventTrigger]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceEventTrigger](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameNull: Self = StObject.set(x, "eventName", null)
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setLogCondition(value: String): Self = StObject.set(x, "logCondition", value.asInstanceOf[js.Any])
    
    inline def setLogConditionNull: Self = StObject.set(x, "logCondition", null)
    
    inline def setLogConditionUndefined: Self = StObject.set(x, "logCondition", js.undefined)
  }
}
