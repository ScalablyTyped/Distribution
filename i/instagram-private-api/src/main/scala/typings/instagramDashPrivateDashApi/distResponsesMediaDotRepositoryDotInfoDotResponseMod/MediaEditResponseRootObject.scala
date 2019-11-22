package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotInfoDotResponseMod

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
    val __obj = js.Dynamic.literal(media = media, status = status)
  
    __obj.asInstanceOf[MediaEditResponseRootObject]
  }
}

