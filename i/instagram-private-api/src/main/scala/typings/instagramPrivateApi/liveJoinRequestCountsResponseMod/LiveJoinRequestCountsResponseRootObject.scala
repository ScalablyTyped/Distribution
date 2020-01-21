package typings.instagramPrivateApi.liveJoinRequestCountsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveJoinRequestCountsResponseRootObject extends js.Object {
  var fetch_ts: Double
  var num_new_requests: Double
  var num_total_requests: Double
  var num_unseen_requests: Double
  var status: String
  var users: js.Array[LiveJoinRequestCountsResponseUsersItem]
}

object LiveJoinRequestCountsResponseRootObject {
  @scala.inline
  def apply(
    fetch_ts: Double,
    num_new_requests: Double,
    num_total_requests: Double,
    num_unseen_requests: Double,
    status: String,
    users: js.Array[LiveJoinRequestCountsResponseUsersItem]
  ): LiveJoinRequestCountsResponseRootObject = {
    val __obj = js.Dynamic.literal(fetch_ts = fetch_ts.asInstanceOf[js.Any], num_new_requests = num_new_requests.asInstanceOf[js.Any], num_total_requests = num_total_requests.asInstanceOf[js.Any], num_unseen_requests = num_unseen_requests.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveJoinRequestCountsResponseRootObject]
  }
}

