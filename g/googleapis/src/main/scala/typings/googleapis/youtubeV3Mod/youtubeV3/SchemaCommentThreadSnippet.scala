package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a comment thread.
  */
@js.native
trait SchemaCommentThreadSnippet extends js.Object {
  /**
    * Whether the current viewer of the thread can reply to it. This is viewer
    * specific - other viewers may see a different value for this field.
    */
  var canReply: js.UndefOr[Boolean] = js.native
  /**
    * The YouTube channel the comments in the thread refer to or the channel
    * with the video the comments refer to. If video_id isn&#39;t set the
    * comments refer to the channel itself.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Whether the thread (and therefore all its comments) is visible to all
    * YouTube users.
    */
  var isPublic: js.UndefOr[Boolean] = js.native
  /**
    * The top level comment of this thread.
    */
  var topLevelComment: js.UndefOr[SchemaComment] = js.native
  /**
    * The total number of replies (not including the top level comment).
    */
  var totalReplyCount: js.UndefOr[Double] = js.native
  /**
    * The ID of the video the comments refer to, if any. No video_id implies a
    * channel discussion comment.
    */
  var videoId: js.UndefOr[String] = js.native
}

object SchemaCommentThreadSnippet {
  @scala.inline
  def apply(
    canReply: js.UndefOr[Boolean] = js.undefined,
    channelId: String = null,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    topLevelComment: SchemaComment = null,
    totalReplyCount: js.UndefOr[Double] = js.undefined,
    videoId: String = null
  ): SchemaCommentThreadSnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canReply)) __obj.updateDynamic("canReply")(canReply.get.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.get.asInstanceOf[js.Any])
    if (topLevelComment != null) __obj.updateDynamic("topLevelComment")(topLevelComment.asInstanceOf[js.Any])
    if (!js.isUndefined(totalReplyCount)) __obj.updateDynamic("totalReplyCount")(totalReplyCount.get.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommentThreadSnippet]
  }
}

