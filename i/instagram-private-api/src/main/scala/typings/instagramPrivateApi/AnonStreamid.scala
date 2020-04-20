package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStreamid extends js.Object {
  var stream_id: String
}

object AnonStreamid {
  @scala.inline
  def apply(stream_id: String): AnonStreamid = {
    val __obj = js.Dynamic.literal(stream_id = stream_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamid]
  }
}

