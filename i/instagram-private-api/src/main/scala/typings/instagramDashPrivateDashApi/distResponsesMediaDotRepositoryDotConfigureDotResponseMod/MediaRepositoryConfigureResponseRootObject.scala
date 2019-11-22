package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureResponseRootObject extends js.Object {
  var media: MediaRepositoryConfigureResponseMedia
  var status: String
  var upload_id: String
}

object MediaRepositoryConfigureResponseRootObject {
  @scala.inline
  def apply(media: MediaRepositoryConfigureResponseMedia, status: String, upload_id: String): MediaRepositoryConfigureResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media, status = status, upload_id = upload_id)
  
    __obj.asInstanceOf[MediaRepositoryConfigureResponseRootObject]
  }
}

