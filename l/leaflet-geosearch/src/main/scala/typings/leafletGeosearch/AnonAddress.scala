package typings.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: AnonCity
}

object AnonAddress {
  @scala.inline
  def apply(address: AnonCity): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

