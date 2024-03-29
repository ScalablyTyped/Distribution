package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubNotificationSettings extends StObject {
  
  /** Cloud pub/sub topic to which notifications are sent (read-only). */
  var cloudTopicName: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#pubsubNotificationSettings`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of event types. Acceptable values are: - "`orderPendingShipment`" */
  var registeredEvents: js.UndefOr[js.Array[String]] = js.undefined
}
object PubsubNotificationSettings {
  
  inline def apply(): PubsubNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubNotificationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubsubNotificationSettings] (val x: Self) extends AnyVal {
    
    inline def setCloudTopicName(value: String): Self = StObject.set(x, "cloudTopicName", value.asInstanceOf[js.Any])
    
    inline def setCloudTopicNameUndefined: Self = StObject.set(x, "cloudTopicName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRegisteredEvents(value: js.Array[String]): Self = StObject.set(x, "registeredEvents", value.asInstanceOf[js.Any])
    
    inline def setRegisteredEventsUndefined: Self = StObject.set(x, "registeredEvents", js.undefined)
    
    inline def setRegisteredEventsVarargs(value: String*): Self = StObject.set(x, "registeredEvents", js.Array(value*))
  }
}
