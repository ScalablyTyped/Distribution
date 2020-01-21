package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListNotificationChannelDescriptors response.
  */
@js.native
trait SchemaListNotificationChannelDescriptorsResponse extends js.Object {
  /**
    * The monitored resource descriptors supported for the specified project,
    * optionally filtered.
    */
  var channelDescriptors: js.UndefOr[js.Array[SchemaNotificationChannelDescriptor]] = js.native
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListNotificationChannelDescriptorsResponse {
  @scala.inline
  def apply(
    channelDescriptors: js.Array[SchemaNotificationChannelDescriptor] = null,
    nextPageToken: String = null
  ): SchemaListNotificationChannelDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (channelDescriptors != null) __obj.updateDynamic("channelDescriptors")(channelDescriptors.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNotificationChannelDescriptorsResponse]
  }
}

