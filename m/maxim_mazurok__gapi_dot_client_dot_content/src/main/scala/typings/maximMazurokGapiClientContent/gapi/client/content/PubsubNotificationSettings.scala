package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubNotificationSettings extends js.Object {
  
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
  implicit class PubsubNotificationSettingsOps[Self <: PubsubNotificationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudTopicName(value: String): Self = this.set("cloudTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudTopicName: Self = this.set("cloudTopicName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRegisteredEventsVarargs(value: String*): Self = this.set("registeredEvents", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredEvents(value: js.Array[String]): Self = this.set("registeredEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredEvents: Self = this.set("registeredEvents", js.undefined)
  }
}
