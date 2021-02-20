package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubNotificationSettings extends StObject {
  
  /** Cloud pub/sub topic to which notifications are sent (read-only). */
  var cloudTopicName: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#pubsubNotificationSettings`" */
  var kind: js.UndefOr[String] = js.native
  
  /** List of event types. Acceptable values are: - "`orderPendingShipment`" */
  var registeredEvents: js.UndefOr[js.Array[String]] = js.native
}
object PubsubNotificationSettings {
  
  @scala.inline
  def apply(): PubsubNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubNotificationSettings]
  }
  
  @scala.inline
  implicit class PubsubNotificationSettingsMutableBuilder[Self <: PubsubNotificationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudTopicName(value: String): Self = StObject.set(x, "cloudTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudTopicNameUndefined: Self = StObject.set(x, "cloudTopicName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRegisteredEvents(value: js.Array[String]): Self = StObject.set(x, "registeredEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredEventsUndefined: Self = StObject.set(x, "registeredEvents", js.undefined)
    
    @scala.inline
    def setRegisteredEventsVarargs(value: String*): Self = StObject.set(x, "registeredEvents", js.Array(value :_*))
  }
}
