package typings.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveAddToPostResponse extends js.Object {
  var broadcasts: js.Array[LiveAddToPostBroadcast]
  var can_reply: Boolean
  var can_reshare: Boolean
  var last_seen_broadcast_ts: Double
  var pk: String
  var status: String
  var user: LiveAddToPostUser
}

object LiveAddToPostResponse {
  @scala.inline
  def apply(
    broadcasts: js.Array[LiveAddToPostBroadcast],
    can_reply: Boolean,
    can_reshare: Boolean,
    last_seen_broadcast_ts: Double,
    pk: String,
    status: String,
    user: LiveAddToPostUser
  ): LiveAddToPostResponse = {
    val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], last_seen_broadcast_ts = last_seen_broadcast_ts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddToPostResponse]
  }
}

