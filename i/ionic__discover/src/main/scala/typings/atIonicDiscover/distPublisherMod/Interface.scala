package typings.atIonicDiscover.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interface extends js.Object {
  var address: String
  var broadcast: String
}

object Interface {
  @scala.inline
  def apply(address: String, broadcast: String): Interface = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Interface]
  }
}

