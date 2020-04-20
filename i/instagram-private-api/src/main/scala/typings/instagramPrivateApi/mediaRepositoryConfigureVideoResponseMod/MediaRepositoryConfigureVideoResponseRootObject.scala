package typings.instagramPrivateApi.mediaRepositoryConfigureVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureVideoResponseRootObject extends js.Object {
  var media: MediaRepositoryConfigureVideoResponseMedia
  var status: String
  var upload_id: String
}

object MediaRepositoryConfigureVideoResponseRootObject {
  @scala.inline
  def apply(media: MediaRepositoryConfigureVideoResponseMedia, status: String, upload_id: String): MediaRepositoryConfigureVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseRootObject]
  }
}

