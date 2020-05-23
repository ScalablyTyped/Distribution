package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerId extends js.Object {
  var serverId: String
}

object ServerId {
  @scala.inline
  def apply(serverId: String): ServerId = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerId]
  }
}

