package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Custom Event.
  */
@js.native
trait SchemaCreativeCustomEvent extends StObject {
  
  /**
    * Unique ID of this event used by Reporting and Data Transfer. This is a
    * read-only field.
    */
  var advertiserCustomEventId: js.UndefOr[String] = js.native
  
  /**
    * User-entered name for the event.
    */
  var advertiserCustomEventName: js.UndefOr[String] = js.native
  
  /**
    * Type of the event. This is a read-only field.
    */
  var advertiserCustomEventType: js.UndefOr[String] = js.native
  
  /**
    * Artwork label column, used to link events in Campaign Manager back to
    * events in Studio. This is a required field and should not be modified
    * after insertion.
    */
  var artworkLabel: js.UndefOr[String] = js.native
  
  /**
    * Artwork type used by the creative.This is a read-only field.
    */
  var artworkType: js.UndefOr[String] = js.native
  
  /**
    * Exit click-through URL for the event. This field is used only for exit
    * events.
    */
  var exitClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  
  /**
    * ID of this event. This is a required field and should not be modified
    * after insertion.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Properties for rich media popup windows. This field is used only for exit
    * events.
    */
  var popupWindowProperties: js.UndefOr[SchemaPopupWindowProperties] = js.native
  
  /**
    * Target type used by the event.
    */
  var targetType: js.UndefOr[String] = js.native
  
  /**
    * Video reporting ID, used to differentiate multiple videos in a single
    * creative. This is a read-only field.
    */
  var videoReportingId: js.UndefOr[String] = js.native
}
object SchemaCreativeCustomEvent {
  
  @scala.inline
  def apply(): SchemaCreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeCustomEvent]
  }
  
  @scala.inline
  implicit class SchemaCreativeCustomEventMutableBuilder[Self <: SchemaCreativeCustomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserCustomEventId(value: String): Self = StObject.set(x, "advertiserCustomEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserCustomEventIdUndefined: Self = StObject.set(x, "advertiserCustomEventId", js.undefined)
    
    @scala.inline
    def setAdvertiserCustomEventName(value: String): Self = StObject.set(x, "advertiserCustomEventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserCustomEventNameUndefined: Self = StObject.set(x, "advertiserCustomEventName", js.undefined)
    
    @scala.inline
    def setAdvertiserCustomEventType(value: String): Self = StObject.set(x, "advertiserCustomEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserCustomEventTypeUndefined: Self = StObject.set(x, "advertiserCustomEventType", js.undefined)
    
    @scala.inline
    def setArtworkLabel(value: String): Self = StObject.set(x, "artworkLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkLabelUndefined: Self = StObject.set(x, "artworkLabel", js.undefined)
    
    @scala.inline
    def setArtworkType(value: String): Self = StObject.set(x, "artworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkTypeUndefined: Self = StObject.set(x, "artworkType", js.undefined)
    
    @scala.inline
    def setExitClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = StObject.set(x, "exitClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitClickThroughUrlUndefined: Self = StObject.set(x, "exitClickThroughUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPopupWindowProperties(value: SchemaPopupWindowProperties): Self = StObject.set(x, "popupWindowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupWindowPropertiesUndefined: Self = StObject.set(x, "popupWindowProperties", js.undefined)
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    @scala.inline
    def setVideoReportingId(value: String): Self = StObject.set(x, "videoReportingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReportingIdUndefined: Self = StObject.set(x, "videoReportingId", js.undefined)
  }
}
