package typings.instagramPrivateApi.mediaRepositoryBlockedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryBlockedResponse extends js.Object {
  var media_ids: js.Array[String]
  var status: String
}

object MediaRepositoryBlockedResponse {
  @scala.inline
  def apply(media_ids: js.Array[String], status: String): MediaRepositoryBlockedResponse = {
    val __obj = js.Dynamic.literal(media_ids = media_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryBlockedResponse]
  }
}

