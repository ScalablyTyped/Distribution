package typings.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseLayoutContent extends js.Object {
  var medias: js.Array[TagsFeedResponseMediasItem]
}

object TagsFeedResponseLayoutContent {
  @scala.inline
  def apply(medias: js.Array[TagsFeedResponseMediasItem]): TagsFeedResponseLayoutContent = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseLayoutContent]
  }
}

