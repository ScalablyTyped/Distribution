package typings.instagramDashPrivateDashApi.distResponsesLiveDotInfoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveInfoResponseBroadcast_owner extends js.Object {
  var friendship_status: LiveInfoResponseFriendship_status
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object LiveInfoResponseBroadcast_owner {
  @scala.inline
  def apply(
    friendship_status: LiveInfoResponseFriendship_status,
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): LiveInfoResponseBroadcast_owner = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveInfoResponseBroadcast_owner]
  }
}

