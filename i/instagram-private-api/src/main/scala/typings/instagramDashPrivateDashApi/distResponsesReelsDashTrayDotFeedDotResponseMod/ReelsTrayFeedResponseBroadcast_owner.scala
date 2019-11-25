package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseBroadcast_owner extends js.Object {
  var friendship_status: ReelsTrayFeedResponseFriendship_status
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var live_subscription_status: String
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object ReelsTrayFeedResponseBroadcast_owner {
  @scala.inline
  def apply(
    friendship_status: ReelsTrayFeedResponseFriendship_status,
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    live_subscription_status: String,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): ReelsTrayFeedResponseBroadcast_owner = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], live_subscription_status = live_subscription_status.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsTrayFeedResponseBroadcast_owner]
  }
}

