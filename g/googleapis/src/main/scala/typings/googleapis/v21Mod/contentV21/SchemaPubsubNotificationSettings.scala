package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsubNotificationSettings extends StObject {
  
  /**
    * Cloud pub/sub topic to which notifications are sent (read-only).
    */
  var cloudTopicName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#pubsubNotificationSettings`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of event types. Acceptable values are: - "`orderPendingShipment`"
    */
  var registeredEvents: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPubsubNotificationSettings {
  
  inline def apply(): SchemaPubsubNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubNotificationSettings]
  }
  
  extension [Self <: SchemaPubsubNotificationSettings](x: Self) {
    
    inline def setCloudTopicName(value: String): Self = StObject.set(x, "cloudTopicName", value.asInstanceOf[js.Any])
    
    inline def setCloudTopicNameNull: Self = StObject.set(x, "cloudTopicName", null)
    
    inline def setCloudTopicNameUndefined: Self = StObject.set(x, "cloudTopicName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRegisteredEvents(value: js.Array[String]): Self = StObject.set(x, "registeredEvents", value.asInstanceOf[js.Any])
    
    inline def setRegisteredEventsNull: Self = StObject.set(x, "registeredEvents", null)
    
    inline def setRegisteredEventsUndefined: Self = StObject.set(x, "registeredEvents", js.undefined)
    
    inline def setRegisteredEventsVarargs(value: String*): Self = StObject.set(x, "registeredEvents", js.Array(value*))
  }
}
