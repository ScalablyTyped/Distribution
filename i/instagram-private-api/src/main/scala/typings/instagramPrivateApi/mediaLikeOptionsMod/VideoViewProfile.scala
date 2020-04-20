package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.video_view_profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoViewProfile extends BaseProfile {
  var module_name: video_view_profile
}

object VideoViewProfile {
  @scala.inline
  def apply(module_name: video_view_profile, user_id: String | Double, username: String): VideoViewProfile = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoViewProfile]
  }
}

