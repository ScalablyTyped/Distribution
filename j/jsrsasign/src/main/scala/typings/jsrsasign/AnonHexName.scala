package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHexName extends js.Object {
  var hex: String
  var name: String
}

object AnonHexName {
  @scala.inline
  def apply(hex: String, name: String): AnonHexName = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHexName]
  }
}

