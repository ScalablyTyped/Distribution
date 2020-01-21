package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseOwner extends js.Object {
  var name: String
  var pk: String
  var profile_pic_url: String
  var profile_pic_username: String
  var `type`: String
}

object TagFeedResponseOwner {
  @scala.inline
  def apply(name: String, pk: String, profile_pic_url: String, profile_pic_username: String, `type`: String): TagFeedResponseOwner = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], profile_pic_username = profile_pic_username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseOwner]
  }
}

