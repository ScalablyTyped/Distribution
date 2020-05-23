package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Streamid extends js.Object {
  var stream_id: String
}

object Streamid {
  @scala.inline
  def apply(stream_id: String): Streamid = {
    val __obj = js.Dynamic.literal(stream_id = stream_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Streamid]
  }
}

