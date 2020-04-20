package typings.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponseLayoutContent extends js.Object {
  var medias: js.Array[LocationFeedResponseMediasItem]
}

object LocationFeedResponseLayoutContent {
  @scala.inline
  def apply(medias: js.Array[LocationFeedResponseMediasItem]): LocationFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseLayoutContent]
  }
}

