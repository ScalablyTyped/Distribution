package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: String
  var broadcast: String
}

object Address {
  @scala.inline
  def apply(address: String, broadcast: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

