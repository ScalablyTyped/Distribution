package typings.instagramDashPrivateDashApi.distResponsesFriendshipDotRepositoryDotShowDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FriendshipRepositoryShowResponseRootObject extends js.Object {
  var blocking: Boolean
  var followed_by: Boolean
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_blocking_reel: Boolean
  var is_muting_reel: Boolean
  var is_private: Boolean
  var muting: Boolean
  var outgoing_request: Boolean
  var status: String
}

object FriendshipRepositoryShowResponseRootObject {
  @scala.inline
  def apply(
    blocking: Boolean,
    followed_by: Boolean,
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_blocking_reel: Boolean,
    is_muting_reel: Boolean,
    is_private: Boolean,
    muting: Boolean,
    outgoing_request: Boolean,
    status: String
  ): FriendshipRepositoryShowResponseRootObject = {
    val __obj = js.Dynamic.literal(blocking = blocking, followed_by = followed_by, following = following, incoming_request = incoming_request, is_bestie = is_bestie, is_blocking_reel = is_blocking_reel, is_muting_reel = is_muting_reel, is_private = is_private, muting = muting, outgoing_request = outgoing_request, status = status)
  
    __obj.asInstanceOf[FriendshipRepositoryShowResponseRootObject]
  }
}

