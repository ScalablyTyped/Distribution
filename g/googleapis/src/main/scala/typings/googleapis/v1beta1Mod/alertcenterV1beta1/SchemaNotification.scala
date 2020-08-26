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
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  @scala.inline
  implicit class SchemaNotificationOps[Self <: SchemaNotification] (val x: Self) extends AnyVal {
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
    def setCloudPubsubTopic(value: SchemaCloudPubsubTopic): Self = this.set("cloudPubsubTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudPubsubTopic: Self = this.set("cloudPubsubTopic", js.undefined)
  }
  
}

