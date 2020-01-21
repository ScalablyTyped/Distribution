package typings.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureSidecarResponseRootObject extends js.Object {
  var client_sidecar_id: String
  var media: MediaRepositoryConfigureSidecarResponseMedia
  var status: String
}

object MediaRepositoryConfigureSidecarResponseRootObject {
  @scala.inline
  def apply(client_sidecar_id: String, media: MediaRepositoryConfigureSidecarResponseMedia, status: String): MediaRepositoryConfigureSidecarResponseRootObject = {
    val __obj = js.Dynamic.literal(client_sidecar_id = client_sidecar_id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseRootObject]
  }
}

