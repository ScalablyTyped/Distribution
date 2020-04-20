package typings.instagramPrivateApi.mediaRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaEditResponseRootObject extends js.Object {
  var media: MediaInfoResponseItemsItem
  var status: String
}

object MediaEditResponseRootObject {
  @scala.inline
  def apply(media: MediaInfoResponseItemsItem, status: String): MediaEditResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEditResponseRootObject]
  }
}

