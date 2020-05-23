package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadcastid extends js.Object {
  var broadcast_id: String
  var upload_url: String
}

object Broadcastid {
  @scala.inline
  def apply(broadcast_id: String, upload_url: String): Broadcastid = {
    val __obj = js.Dynamic.literal(broadcast_id = broadcast_id.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcastid]
  }
}

