package typings.instagramDashPrivateDashApi.distResponsesMediaDotUpdatedDashMediaDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseRootObject extends js.Object {
  var status: String
  var updated_media: MediaUpdatedMediaResponseUpdated_media
}

object MediaUpdatedMediaResponseRootObject {
  @scala.inline
  def apply(status: String, updated_media: MediaUpdatedMediaResponseUpdated_media): MediaUpdatedMediaResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaUpdatedMediaResponseRootObject]
  }
}

