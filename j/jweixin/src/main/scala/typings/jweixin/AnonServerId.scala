package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServerId extends js.Object {
  var serverId: String
}

object AnonServerId {
  @scala.inline
  def apply(serverId: String): AnonServerId = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonServerId]
  }
}

