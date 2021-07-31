package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for callback notifications. For more details see [G Suite Alert
  * Notification](/admin-sdk/alertcenter/guides/notifications).
  */
trait SchemaNotification extends StObject {
  
  /**
    * A Google Cloud Pub/sub topic destination.
    */
  var cloudPubsubTopic: js.UndefOr[SchemaCloudPubsubTopic] = js.undefined
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationMutableBuilder[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudPubsubTopic(value: SchemaCloudPubsubTopic): Self = StObject.set(x, "cloudPubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudPubsubTopicUndefined: Self = StObject.set(x, "cloudPubsubTopic", js.undefined)
  }
}
