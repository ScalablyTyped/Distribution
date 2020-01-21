package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: String
  var broadcast: String
}

object AnonAddress {
  @scala.inline
  def apply(address: String, broadcast: String): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddress]
  }
}

