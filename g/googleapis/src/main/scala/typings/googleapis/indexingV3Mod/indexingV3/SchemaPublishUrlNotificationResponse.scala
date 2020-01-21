package typings.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output for PublishUrlNotification
  */
@js.native
trait SchemaPublishUrlNotificationResponse extends js.Object {
  /**
    * Description of the notification events received for this URL.
    */
  var urlNotificationMetadata: js.UndefOr[SchemaUrlNotificationMetadata] = js.native
}

object SchemaPublishUrlNotificationResponse {
  @scala.inline
  def apply(urlNotificationMetadata: SchemaUrlNotificationMetadata = null): SchemaPublishUrlNotificationResponse = {
    val __obj = js.Dynamic.literal()
    if (urlNotificationMetadata != null) __obj.updateDynamic("urlNotificationMetadata")(urlNotificationMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublishUrlNotificationResponse]
  }
}

