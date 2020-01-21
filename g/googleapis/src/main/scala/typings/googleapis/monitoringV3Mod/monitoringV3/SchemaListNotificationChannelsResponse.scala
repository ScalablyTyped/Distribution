package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListNotificationChannels response.
  */
@js.native
trait SchemaListNotificationChannelsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The notification channels defined for the specified project.
    */
  var notificationChannels: js.UndefOr[js.Array[SchemaNotificationChannel]] = js.native
}

object SchemaListNotificationChannelsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, notificationChannels: js.Array[SchemaNotificationChannel] = null): SchemaListNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (notificationChannels != null) __obj.updateDynamic("notificationChannels")(notificationChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNotificationChannelsResponse]
  }
}

