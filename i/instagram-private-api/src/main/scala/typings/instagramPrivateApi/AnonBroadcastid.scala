package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBroadcastid extends js.Object {
  var broadcast_id: String
  var upload_url: String
}

object AnonBroadcastid {
  @scala.inline
  def apply(broadcast_id: String, upload_url: String): AnonBroadcastid = {
    val __obj = js.Dynamic.literal(broadcast_id = broadcast_id.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBroadcastid]
  }
}

