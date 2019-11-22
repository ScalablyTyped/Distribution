package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDashVideoDotResponseMod

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
    val __obj = js.Dynamic.literal(media = media, status = status, upload_id = upload_id)
  
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseRootObject]
  }
}

