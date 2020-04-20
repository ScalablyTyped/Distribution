package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHex extends js.Object {
  var hex: String
}

object AnonHex {
  @scala.inline
  def apply(hex: String): AnonHex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHex]
  }
}

