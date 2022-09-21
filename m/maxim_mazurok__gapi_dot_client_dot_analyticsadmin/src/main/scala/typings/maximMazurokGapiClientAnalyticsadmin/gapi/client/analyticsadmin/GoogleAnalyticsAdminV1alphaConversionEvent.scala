package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaConversionEvent extends StObject {
  
  /** Output only. Time when this conversion event was created in the property. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. If set to true, this conversion event refers to a custom event. If set to false, this conversion event refers to a default event in GA. Default events typically have
    * special meaning in GA. Default events are usually created for you by the GA system, but in some cases can be created by property admins. Custom events count towards the maximum
    * number of custom conversion events that may be created per property.
    */
  var custom: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. If set, this event can currently be deleted via DeleteConversionEvent. */
  var deletable: js.UndefOr[Boolean] = js.undefined
  
  /** Immutable. The event name for this conversion event. Examples: 'click', 'purchase' */
  var eventName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of this conversion event. Format: properties/{property}/conversionEvents/{conversion_event} */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaConversionEvent {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaConversionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaConversionEvent]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaConversionEvent](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
    
    inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
