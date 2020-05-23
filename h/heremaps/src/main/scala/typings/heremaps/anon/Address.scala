package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: City
  var position: js.Array[Double]
}

object Address {
  @scala.inline
  def apply(address: City, position: js.Array[Double]): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

