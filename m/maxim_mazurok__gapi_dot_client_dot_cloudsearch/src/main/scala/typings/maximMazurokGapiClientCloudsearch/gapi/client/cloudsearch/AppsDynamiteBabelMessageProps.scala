package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBabelMessageProps extends StObject {
  
  /** Babel clients locally generate this ID to dedupe against the async fanout. */
  var clientGeneratedId: js.UndefOr[String] = js.undefined
  
  /** Stores additional Babel-specific properties (such as event metadata). */
  var contentExtension: js.UndefOr[ChatContentExtension] = js.undefined
  
  /** Stores the delivery source of messages (such as phone number for SMS). */
  var deliveryMedium: js.UndefOr[DeliveryMedium] = js.undefined
  
  /** Primary identifier used by Hangouts Classic for its events (messages). */
  var eventId: js.UndefOr[String] = js.undefined
  
  /** Stores message segments (text content) and attachments (media URLs). */
  var messageContent: js.UndefOr[MessageContent] = js.undefined
  
  /** Whether or not these message properties were backfilled by go/dinnertrain. */
  var wasUpdatedByBackfill: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteBabelMessageProps {
  
  inline def apply(): AppsDynamiteBabelMessageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBabelMessageProps]
  }
  
  extension [Self <: AppsDynamiteBabelMessageProps](x: Self) {
    
    inline def setClientGeneratedId(value: String): Self = StObject.set(x, "clientGeneratedId", value.asInstanceOf[js.Any])
    
    inline def setClientGeneratedIdUndefined: Self = StObject.set(x, "clientGeneratedId", js.undefined)
    
    inline def setContentExtension(value: ChatContentExtension): Self = StObject.set(x, "contentExtension", value.asInstanceOf[js.Any])
    
    inline def setContentExtensionUndefined: Self = StObject.set(x, "contentExtension", js.undefined)
    
    inline def setDeliveryMedium(value: DeliveryMedium): Self = StObject.set(x, "deliveryMedium", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMediumUndefined: Self = StObject.set(x, "deliveryMedium", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setMessageContent(value: MessageContent): Self = StObject.set(x, "messageContent", value.asInstanceOf[js.Any])
    
    inline def setMessageContentUndefined: Self = StObject.set(x, "messageContent", js.undefined)
    
    inline def setWasUpdatedByBackfill(value: Boolean): Self = StObject.set(x, "wasUpdatedByBackfill", value.asInstanceOf[js.Any])
    
    inline def setWasUpdatedByBackfillUndefined: Self = StObject.set(x, "wasUpdatedByBackfill", js.undefined)
  }
}
