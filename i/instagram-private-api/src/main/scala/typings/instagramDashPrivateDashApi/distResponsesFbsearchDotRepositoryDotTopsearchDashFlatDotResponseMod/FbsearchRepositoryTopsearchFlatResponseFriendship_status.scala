package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponseFriendship_status extends js.Object {
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var outgoing_request: Boolean
}

object FbsearchRepositoryTopsearchFlatResponseFriendship_status {
  @scala.inline
  def apply(
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    outgoing_request: Boolean
  ): FbsearchRepositoryTopsearchFlatResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseFriendship_status]
  }
}

