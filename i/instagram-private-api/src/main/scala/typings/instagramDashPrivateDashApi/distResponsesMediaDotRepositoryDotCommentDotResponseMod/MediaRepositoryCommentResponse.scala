package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotCommentDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryCommentResponse extends js.Object {
  var comment: MediaRepositoryCommentResponseComment
  var status: String
}

object MediaRepositoryCommentResponse {
  @scala.inline
  def apply(comment: MediaRepositoryCommentResponseComment, status: String): MediaRepositoryCommentResponse = {
    val __obj = js.Dynamic.literal(comment = comment, status = status)
  
    __obj.asInstanceOf[MediaRepositoryCommentResponse]
  }
}

