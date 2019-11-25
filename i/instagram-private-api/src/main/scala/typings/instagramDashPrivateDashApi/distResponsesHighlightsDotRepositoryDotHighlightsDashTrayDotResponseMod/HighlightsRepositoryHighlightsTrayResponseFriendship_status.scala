package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseFriendship_status extends js.Object {
  var blocking: js.UndefOr[Boolean] = js.undefined
  var followed_by: js.UndefOr[Boolean] = js.undefined
  var following: Boolean
  var incoming_request: js.UndefOr[Boolean] = js.undefined
  var is_bestie: Boolean
  var is_private: js.UndefOr[Boolean] = js.undefined
  var is_restricted: Boolean
  var muting: js.UndefOr[Boolean] = js.undefined
  var outgoing_request: Boolean
}

object HighlightsRepositoryHighlightsTrayResponseFriendship_status {
  @scala.inline
  def apply(
    following: Boolean,
    is_bestie: Boolean,
    is_restricted: Boolean,
    outgoing_request: Boolean,
    blocking: js.UndefOr[Boolean] = js.undefined,
    followed_by: js.UndefOr[Boolean] = js.undefined,
    incoming_request: js.UndefOr[Boolean] = js.undefined,
    is_private: js.UndefOr[Boolean] = js.undefined,
    muting: js.UndefOr[Boolean] = js.undefined
  ): HighlightsRepositoryHighlightsTrayResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    if (!js.isUndefined(blocking)) __obj.updateDynamic("blocking")(blocking.asInstanceOf[js.Any])
    if (!js.isUndefined(followed_by)) __obj.updateDynamic("followed_by")(followed_by.asInstanceOf[js.Any])
    if (!js.isUndefined(incoming_request)) __obj.updateDynamic("incoming_request")(incoming_request.asInstanceOf[js.Any])
    if (!js.isUndefined(is_private)) __obj.updateDynamic("is_private")(is_private.asInstanceOf[js.Any])
    if (!js.isUndefined(muting)) __obj.updateDynamic("muting")(muting.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseFriendship_status]
  }
}

