package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment thread represents information that applies to a top level comment
  * and all its replies. It can also include the top level comment itself and
  * some of the replies.
  */
@js.native
trait SchemaCommentThread extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the comment thread.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#commentThread&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The replies object contains a limited number of replies (if any) to the
    * top level comment found in the snippet.
    */
  var replies: js.UndefOr[SchemaCommentThreadReplies] = js.native
  /**
    * The snippet object contains basic details about the comment thread and
    * also the top level comment.
    */
  var snippet: js.UndefOr[SchemaCommentThreadSnippet] = js.native
}

object SchemaCommentThread {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    replies: SchemaCommentThreadReplies = null,
    snippet: SchemaCommentThreadSnippet = null
  ): SchemaCommentThread = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommentThread]
  }
}

