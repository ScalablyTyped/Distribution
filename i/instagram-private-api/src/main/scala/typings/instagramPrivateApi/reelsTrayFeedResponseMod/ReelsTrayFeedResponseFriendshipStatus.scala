package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseFriendshipStatus extends js.Object {
  var blocking: js.UndefOr[Boolean] = js.undefined
  var followed_by: js.UndefOr[Boolean] = js.undefined
  var following: Boolean
  var incoming_request: js.UndefOr[Boolean] = js.undefined
  var is_bestie: js.UndefOr[Boolean] = js.undefined
  var is_muting_reel: Boolean
  var is_private: js.UndefOr[Boolean] = js.undefined
  var is_restricted: js.UndefOr[Boolean] = js.undefined
  var muting: Boolean
  var outgoing_request: Boolean
}

object ReelsTrayFeedResponseFriendshipStatus {
  @scala.inline
  def apply(
    following: Boolean,
    is_muting_reel: Boolean,
    muting: Boolean,
    outgoing_request: Boolean,
    blocking: js.UndefOr[Boolean] = js.undefined,
    followed_by: js.UndefOr[Boolean] = js.undefined,
    incoming_request: js.UndefOr[Boolean] = js.undefined,
    is_bestie: js.UndefOr[Boolean] = js.undefined,
    is_private: js.UndefOr[Boolean] = js.undefined,
    is_restricted: js.UndefOr[Boolean] = js.undefined
  ): ReelsTrayFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    if (!js.isUndefined(blocking)) __obj.updateDynamic("blocking")(blocking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followed_by)) __obj.updateDynamic("followed_by")(followed_by.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incoming_request)) __obj.updateDynamic("incoming_request")(incoming_request.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_bestie)) __obj.updateDynamic("is_bestie")(is_bestie.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_private)) __obj.updateDynamic("is_private")(is_private.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_restricted)) __obj.updateDynamic("is_restricted")(is_restricted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseFriendshipStatus]
  }
}

