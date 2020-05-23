package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseFriendshipStatus extends js.Object {
  var blocking: js.UndefOr[Boolean] = js.undefined
  var followed_by: js.UndefOr[Boolean] = js.undefined
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var is_restricted: Boolean
  var muting: js.UndefOr[Boolean] = js.undefined
  var outgoing_request: Boolean
}

object IgtvSearchResponseFriendshipStatus {
  @scala.inline
  def apply(
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    is_restricted: Boolean,
    outgoing_request: Boolean,
    blocking: js.UndefOr[Boolean] = js.undefined,
    followed_by: js.UndefOr[Boolean] = js.undefined,
    muting: js.UndefOr[Boolean] = js.undefined
  ): IgtvSearchResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    if (!js.isUndefined(blocking)) __obj.updateDynamic("blocking")(blocking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followed_by)) __obj.updateDynamic("followed_by")(followed_by.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muting)) __obj.updateDynamic("muting")(muting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseFriendshipStatus]
  }
}

