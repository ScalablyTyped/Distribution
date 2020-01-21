package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveBroadcastSnippet extends js.Object {
  /**
    * The date and time that the broadcast actually ended. This information is
    * only available once the broadcast&#39;s state is complete. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualEndTime: js.UndefOr[String] = js.native
  /**
    * The date and time that the broadcast actually started. This information
    * is only available once the broadcast&#39;s state is live. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualStartTime: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel that is
    * publishing the broadcast.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The broadcast&#39;s description. As with the title, you can set this
    * field by modifying the broadcast resource or by setting the description
    * field of the corresponding video resource.
    */
  var description: js.UndefOr[String] = js.native
  var isDefaultBroadcast: js.UndefOr[Boolean] = js.native
  /**
    * The id of the live chat for this broadcast.
    */
  var liveChatId: js.UndefOr[String] = js.native
  /**
    * The date and time that the broadcast was added to YouTube&#39;s live
    * broadcast schedule. The value is specified in ISO 8601
    * (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * The date and time that the broadcast is scheduled to end. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var scheduledEndTime: js.UndefOr[String] = js.native
  /**
    * The date and time that the broadcast is scheduled to start. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var scheduledStartTime: js.UndefOr[String] = js.native
  /**
    * A map of thumbnail images associated with the broadcast. For each nested
    * object in this object, the key is the name of the thumbnail image, and
    * the value is an object that contains other information about the
    * thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The broadcast&#39;s title. Note that the broadcast represents exactly one
    * YouTube video. You can set this field by modifying the broadcast resource
    * or by setting the title field of the corresponding video resource.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaLiveBroadcastSnippet {
  @scala.inline
  def apply(
    actualEndTime: String = null,
    actualStartTime: String = null,
    channelId: String = null,
    description: String = null,
    isDefaultBroadcast: js.UndefOr[Boolean] = js.undefined,
    liveChatId: String = null,
    publishedAt: String = null,
    scheduledEndTime: String = null,
    scheduledStartTime: String = null,
    thumbnails: SchemaThumbnailDetails = null,
    title: String = null
  ): SchemaLiveBroadcastSnippet = {
    val __obj = js.Dynamic.literal()
    if (actualEndTime != null) __obj.updateDynamic("actualEndTime")(actualEndTime.asInstanceOf[js.Any])
    if (actualStartTime != null) __obj.updateDynamic("actualStartTime")(actualStartTime.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultBroadcast)) __obj.updateDynamic("isDefaultBroadcast")(isDefaultBroadcast.asInstanceOf[js.Any])
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (scheduledEndTime != null) __obj.updateDynamic("scheduledEndTime")(scheduledEndTime.asInstanceOf[js.Any])
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveBroadcastSnippet]
  }
}

