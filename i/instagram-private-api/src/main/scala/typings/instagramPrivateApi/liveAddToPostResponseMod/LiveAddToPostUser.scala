package typings.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveAddToPostUser extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_url: String
  var username: String
}

object LiveAddToPostUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String
  ): LiveAddToPostUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddToPostUser]
  }
}

