package typings.instagramDashPrivateDashApi.distResponsesDiscoverDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverFeedResponseRootObject extends js.Object {
  var max_id: String
  var more_available: Boolean
  var new_suggested_users: DiscoverFeedResponseNew_suggested_users
  var next_max_id: String
  var status: String
  var suggested_users: DiscoverFeedResponseSuggested_users
}

object DiscoverFeedResponseRootObject {
  @scala.inline
  def apply(
    max_id: String,
    more_available: Boolean,
    new_suggested_users: DiscoverFeedResponseNew_suggested_users,
    next_max_id: String,
    status: String,
    suggested_users: DiscoverFeedResponseSuggested_users
  ): DiscoverFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(max_id = max_id, more_available = more_available, new_suggested_users = new_suggested_users, next_max_id = next_max_id, status = status, suggested_users = suggested_users)
  
    __obj.asInstanceOf[DiscoverFeedResponseRootObject]
  }
}

