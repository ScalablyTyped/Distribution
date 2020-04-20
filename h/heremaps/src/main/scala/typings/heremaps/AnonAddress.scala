package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: AnonCity
  var position: js.Array[Double]
}

object AnonAddress {
  @scala.inline
  def apply(address: AnonCity, position: js.Array[Double]): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

