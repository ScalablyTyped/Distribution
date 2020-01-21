package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Comments written in (direct or indirect) reply to the top level comment.
  */
@js.native
trait SchemaCommentThreadReplies extends js.Object {
  /**
    * A limited number of replies. Unless the number of replies returned equals
    * total_reply_count in the snippet the returned replies are only a subset
    * of the total number of replies.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.native
}

object SchemaCommentThreadReplies {
  @scala.inline
  def apply(comments: js.Array[SchemaComment] = null): SchemaCommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommentThreadReplies]
  }
}

