package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for callback notifications. For more details see [G Suite Alert
  * Notification](/admin-sdk/alertcenter/guides/notifications).
  */
@js.native
trait SchemaNotification extends js.Object {
  /**
    * A Google Cloud Pub/sub topic destination.
    */
  var cloudPubsubTopic: js.UndefOr[SchemaCloudPubsubTopic] = js.native
}

object SchemaNotification {
  @scala.inline
  def apply(cloudPubsubTopic: SchemaCloudPubsubTopic = null): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    if (cloudPubsubTopic != null) __obj.updateDynamic("cloudPubsubTopic")(cloudPubsubTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotification]
  }
}

