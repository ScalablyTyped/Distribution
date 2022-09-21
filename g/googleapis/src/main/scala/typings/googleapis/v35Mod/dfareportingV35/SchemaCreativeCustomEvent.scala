package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeCustomEvent extends StObject {
  
  /**
    * Unique ID of this event used by Reporting and Data Transfer. This is a read-only field.
    */
  var advertiserCustomEventId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-entered name for the event.
    */
  var advertiserCustomEventName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the event. This is a read-only field.
    */
  var advertiserCustomEventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Artwork label column, used to link events in Campaign Manager back to events in Studio. This is a required field and should not be modified after insertion.
    */
  var artworkLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Artwork type used by the creative.This is a read-only field.
    */
  var artworkType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Exit click-through URL for the event. This field is used only for exit events.
    */
  var exitClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.undefined
  
  /**
    * ID of this event. This is a required field and should not be modified after insertion.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Properties for rich media popup windows. This field is used only for exit events.
    */
  var popupWindowProperties: js.UndefOr[SchemaPopupWindowProperties] = js.undefined
  
  /**
    * Target type used by the event.
    */
  var targetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-only field.
    */
  var videoReportingId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeCustomEvent {
  
  inline def apply(): SchemaCreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeCustomEvent]
  }
  
  extension [Self <: SchemaCreativeCustomEvent](x: Self) {
    
    inline def setAdvertiserCustomEventId(value: String): Self = StObject.set(x, "advertiserCustomEventId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserCustomEventIdNull: Self = StObject.set(x, "advertiserCustomEventId", null)
    
    inline def setAdvertiserCustomEventIdUndefined: Self = StObject.set(x, "advertiserCustomEventId", js.undefined)
    
    inline def setAdvertiserCustomEventName(value: String): Self = StObject.set(x, "advertiserCustomEventName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserCustomEventNameNull: Self = StObject.set(x, "advertiserCustomEventName", null)
    
    inline def setAdvertiserCustomEventNameUndefined: Self = StObject.set(x, "advertiserCustomEventName", js.undefined)
    
    inline def setAdvertiserCustomEventType(value: String): Self = StObject.set(x, "advertiserCustomEventType", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserCustomEventTypeNull: Self = StObject.set(x, "advertiserCustomEventType", null)
    
    inline def setAdvertiserCustomEventTypeUndefined: Self = StObject.set(x, "advertiserCustomEventType", js.undefined)
    
    inline def setArtworkLabel(value: String): Self = StObject.set(x, "artworkLabel", value.asInstanceOf[js.Any])
    
    inline def setArtworkLabelNull: Self = StObject.set(x, "artworkLabel", null)
    
    inline def setArtworkLabelUndefined: Self = StObject.set(x, "artworkLabel", js.undefined)
    
    inline def setArtworkType(value: String): Self = StObject.set(x, "artworkType", value.asInstanceOf[js.Any])
    
    inline def setArtworkTypeNull: Self = StObject.set(x, "artworkType", null)
    
    inline def setArtworkTypeUndefined: Self = StObject.set(x, "artworkType", js.undefined)
    
    inline def setExitClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = StObject.set(x, "exitClickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setExitClickThroughUrlUndefined: Self = StObject.set(x, "exitClickThroughUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPopupWindowProperties(value: SchemaPopupWindowProperties): Self = StObject.set(x, "popupWindowProperties", value.asInstanceOf[js.Any])
    
    inline def setPopupWindowPropertiesUndefined: Self = StObject.set(x, "popupWindowProperties", js.undefined)
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeNull: Self = StObject.set(x, "targetType", null)
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setVideoReportingId(value: String): Self = StObject.set(x, "videoReportingId", value.asInstanceOf[js.Any])
    
    inline def setVideoReportingIdNull: Self = StObject.set(x, "videoReportingId", null)
    
    inline def setVideoReportingIdUndefined: Self = StObject.set(x, "videoReportingId", js.undefined)
  }
}
